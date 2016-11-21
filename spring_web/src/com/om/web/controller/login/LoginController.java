package com.om.web.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.om.web.dto.login.LoginDTO;


@Component
@RequestMapping("/")
public class LoginController {

	public LoginController() {
		System.out.println(this.getClass().getSimpleName() + "Created...");
	}

	@RequestMapping("/login.do")
	public String auth(@ModelAttribute LoginDTO loginDTO, HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		System.out.println("inside auth method controller...,,.");
		System.out.println("login dto \t" + loginDTO);
		if ("om".equals(loginDTO.getUserid()) && "pass".equals(loginDTO.getPwd())) {
			System.out.println("Valid user");
			session.setAttribute("userid", loginDTO.getUserid());
			return "/Home.jsp";
		}
		System.out.println("Invalid user");
		return "/Login.jsp";

	}

}
