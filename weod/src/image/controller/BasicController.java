package image.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import image.test.User;

@Controller
public class BasicController {

	/**
	 * 通过参数获得用户的值
	 * @author cewin
	 * @email cewin95@foxmaill.com
	 * @version 1.0
	 * @date 2017年9月13日	下午6:33:28
	 * @param username
	 * @return
	 */
	@RequestMapping("/weodimage.action")
	@ResponseBody
	public User getUserInfo(String username) {
		System.out.println(username);
		User user = new User();
		user.setUsername(username);
		
		return user;
		
	}
	
}
