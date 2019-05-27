package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Change the url using the following terms : <ul><li><a href='http://localhost:8080/doctor/1'>/doctor/1</a></li><li><a href='http://localhost:8080/doctor/2'>/doctor/2</a></li><li><a href='http://localhost:8080/doctor/3'>/doctor/3</a></li><li><a href='http://localhost:8080/doctor/4'>/doctor/4</a></li></ul";
	}
}