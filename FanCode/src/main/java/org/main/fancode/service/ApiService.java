package org.main.fancode.service;

import org.main.fancode.dto.TodoDto;
import org.main.fancode.dto.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
	
	    private final String BASE_URL = "http://jsonplaceholder.typicode.com";
	    private final RestTemplate restTemplate;

	    public ApiService(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }

	    public User[] getUsers() {
	        return restTemplate.getForObject(BASE_URL + "/users", User[].class);
	    }

	    public TodoDto[] getTodosByUserId(int userId) {
	        return restTemplate.getForObject(BASE_URL + "/todos?userId=" + userId, TodoDto[].class);
	    }
}


