package io.getarrays.userservice;

import io.getarrays.userservice.domain.Player;
import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return  new BCryptPasswordEncoder();

	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {

			//userService.saveRole(new Role(null, "ROLE_BASIC_USER"));	//one that can register and login but not use the game

			userService.saveRole(new Role(null, "ROLE_USER"));

			//userService.saveRole(new Role(null, "ROLE_MEMBER"));

			//userService.saveRole(new Role(null, "ROLE_USERPLUS"));	//donated user

			//userService.saveRole(new Role(null, "ROLE_MEMBER_PLUS"));	//donated member



			userService.saveRole(new Role(null, "ROLE_MANAGER"));

			userService.saveRole(new Role(null, "ROLE_ADMIN"));

			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

//			userService.savePlayer(new Player(null, "Bob Jones", "bob@gmail.com", "Bob", "1234", new ArrayList<>(), new ArrayList<>()));
//
//			userService.savePlayer(new Player(null, "John Smith", "johnsmith@gmail.com", "JohnSmith", "1234", new ArrayList<>(), new ArrayList<>()));
//
//			userService.savePlayer(new Player(null, "James Franco", "james@gmail.com", "jamesfranco", "1234", new ArrayList<>(), new ArrayList<>()));


			userService.savePlayer(new Player(null, "Bob Jones", "bob@gmail.com", "Bob", "1234", new ArrayList<>(), 1000, 20, 1, 30, 60, 500));

			userService.savePlayer(new Player(null, "John Smith", "johnsmith@gmail.com", "JohnSmith", "1234", new ArrayList<>(), 9999, 20, 2, 50, 80, 1000));

			userService.savePlayer(new Player(null, "James Franco", "james@gmail.com", "jamesfranco", "1234", new ArrayList<>(), 20, 20, 5, 40, 30, 300));


			userService.addRoleToUser("Bob", "ROLE_USER");
			userService.addRoleToUser("JohnSmith", "ROLE_ADMIN");
			userService.addRoleToUser("jamesfranco", "ROLE_SUPER_ADMIN");

//			userService.initInventory("Bob");
//			userService.initInventory("JohnSmith");
//			userService.initInventory("jamesfranco");



		};
	}



}
