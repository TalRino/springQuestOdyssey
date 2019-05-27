package com.wildcodeschool.myProject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class RouteFour {

	@RequestMapping("doctor/4")
	@ResponseBody
	public String index() {
        return "<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Tom_Baker.jpg/220px-Tom_Baker.jpg'/></br>Tom Baker was the fourth doctor !";
	};
}