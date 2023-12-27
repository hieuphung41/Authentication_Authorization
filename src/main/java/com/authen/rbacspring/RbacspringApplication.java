package com.authen.rbacspring;

import com.authen.rbacspring.entity.Role;
import com.authen.rbacspring.entity.User;
import com.authen.rbacspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class RbacspringApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(RbacspringApplication.class, args);
	}

	public void run(String... args) {
		User adminAccount = userRepository.findByRole(Role.ADMIN);
		if (null == adminAccount) {
			User user = new User();
			user.setEmail("admin@gmail.com");
			user.setFirstName("admin");
			user.setLastName("admin");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));

			userRepository.save(user);
		}
	}
}
