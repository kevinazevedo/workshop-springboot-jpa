package com.dev.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dev.course.entities.Order;
import com.dev.course.entities.User;
import com.dev.course.repositories.OrderRepository;
import com.dev.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Elon Musk", "musk@gmail.com", "976674545", "123123");
		User u2 = new User(null, "Mark Zuck", "zuck@gmail.com", "980807070", "12345678");
		
		Order o1 = new Order(null, Instant.parse("2024-03-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2024-04-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2024-04-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
