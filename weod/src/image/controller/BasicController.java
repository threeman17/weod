package image.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String getUserInfo(String username) {
		System.out.println(username);
		return "static/weodimage";
		
	}
	
}
