package org.main.fancode.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.main.fancode.dto.TodoDto;
import org.main.fancode.dto.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	    private final ApiService apiService;

	    public UserService(ApiService apiService) {
	        this.apiService = apiService;
	    }

	    public List<User> getFanCodeUsers() {
	        return Arrays.stream(apiService.getUsers())
	            .filter(this::isUserFromFanCode)
	            .collect(Collectors.toList());
	    }

	    public boolean isUserFromFanCode(User user) {
	        double lat = Double.parseDouble(user.getAddress().getGeo().getLat());
	        double lng = Double.parseDouble(user.getAddress().getGeo().getLng());
	        return (lat > -40 && lat < 5) && (lng > 5 && lng < 100);
	    }

	    public boolean hasCompletedMoreThanHalfOfTodos(int userId) {
	        TodoDto[] todos = apiService.getTodosByUserId(userId);
	        long completedTasks = Arrays.stream(todos).filter(TodoDto::isCompleted).count();
	        return completedTasks > (todos.length / 2);
	    }

	    public void validateUserTaskCompletion() {
	        List<User> users = getFanCodeUsers();
	        for (User user : users) {
	            if (!hasCompletedMoreThanHalfOfTodos(user.getId())) {
	                System.out.println("User " + user.getName() + " has not completed more than 50% of tasks.");
	            } else {
	                System.out.println("User " + user.getName() + " has completed more than 50% of tasks.");
	            }
	        }
	    }
	}


