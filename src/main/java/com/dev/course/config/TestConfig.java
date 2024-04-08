package com.dev.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dev.course.entities.User;
import com.dev.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Elon Musk", "musk@gmail.com", "976674545", "123123");
		User u2 = new User(null, "Mark Zuck", "zuck@gmail.com", "980807070", "12345678");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
