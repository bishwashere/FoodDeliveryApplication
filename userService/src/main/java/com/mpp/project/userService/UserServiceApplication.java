package com.mpp.project.userService;

import com.mpp.project.userService.model.User;
import com.mpp.project.userService.model.UserRole;
import com.mpp.project.userService.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class UserServiceApplication {

	@Autowired
	private UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	@PostConstruct
	public void constructDb(){
		userRepo.save(new User(null, "pizzaCorner", "pizzacorner" , UserRole.RESTAURANT.toString(), "Pizza Corner", "", "pizzacorner@pizza.com", "100N Fourth Street", "Fairfield", "Iowa", 52557, "3234", ""));
	}

}
