package com.opentext.MyFirstApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@RestController
public class MyFirstApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyFirstApplication.class, args);
//		We will start our application from here
	}
}