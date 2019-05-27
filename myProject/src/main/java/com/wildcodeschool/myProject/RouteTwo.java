package com.wildcodeschool.myProject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class RouteTwo {

	@RequestMapping("doctor/2")
	@ResponseBody
	public String index() {
        return "<img src='https://upload.wikimedia.org/wikipedia/en/thumb/8/80/Patrick_Troughton_Head.jpg/220px-Patrick_Troughton_Head.jpg'/></br>Patrick Troughton was the second doctor !";
	};
}