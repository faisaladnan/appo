package com.rikit.appo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.rikit.appo.repository.UserRepository;
import com.rikit.appo.service.UserService;
import com.rikit.appo.service.impl.UserServiceImpl;

@SpringBootApplication
@RestController
public class AppoApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(AppoApplication.class, args);
	}
	
	@Bean
	public UserService userService(UserRepository userRepository)
	{
		UserService userService = new UserServiceImpl();
		return userService;
	}
	
	
}
