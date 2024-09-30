package org.main.fancode;

import org.main.fancode.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FanCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FanCodeApplication.class, args);
		 ApplicationContext context = new AnnotationConfigApplicationContext(FanCodeApplication.class);
	        UserService userService = context.getBean(UserService.class);
	        userService.validateUserTaskCompletion();
	}

}
