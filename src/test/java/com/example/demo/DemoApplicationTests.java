package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	static class HelloController {
		@GetMapping("/hello")
		public String sayHello() {
			return "Hello, World!";
		}
	}
	@RestController
	static class HelloControllerr {
		@GetMapping("/hell")
		public String sayHello() {
			return "Hello, !";
		}
	}
	@RestController
	static class HelloControlwler {
		@GetMapping("/")
		public String sayHello() {
			return "root site";
		}
	}
	@RestController
	static class HellwwoController {
		@GetMapping("/about")
		public String sayHello() {
			return "about, World!";
		}
	}
}
