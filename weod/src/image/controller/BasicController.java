package image.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {

	@RequestMapping("/weodimage.action")
	public String getUserInfo(String username) {
		System.out.println(username);
		return "index";
		
	}
	
}
