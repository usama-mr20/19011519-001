package com.spring.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

		@RequestMapping ( value ="/main" )
		public String get(){
			return "Hello World";

		}


}
