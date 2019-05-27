package com.wildcodeschool.myProject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class RouteOne {

	@RequestMapping("doctor/1")
	@ResponseBody
	public String index() {
        return "<img src='https://upload.wikimedia.org/wikipedia/en/thumb/a/aa/William_Hartnell.jpg/220px-William_Hartnell.jpg'/></br>William Hartnell was a first doctor !";
	};
}