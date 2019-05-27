package com.wildcodeschool.myProject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class RouteThree {

	@RequestMapping("doctor/3")
	@ResponseBody
	public String index() {
        return "<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Jon_Pertwee_%28filtered%29.jpg/220px-Jon_Pertwee_%28filtered%29.jpg'/></br>Jon Pertwee was the third doctor !";
	};
}