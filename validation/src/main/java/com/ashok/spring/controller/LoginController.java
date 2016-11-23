package com.ashok.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashok.spring.dto.login.LoginDTO;

@Component
@RequestMapping("/")
public class LoginController {

	@Autowired
	LocalValidatorFactoryBean validator;

	@RequestMapping("/welcome.do")
	public String welcomePage(HttpServletRequest request) {
		System.out.println("welcome page and command object...");
		request.setAttribute("dto", new LoginDTO());
		return "/Login.jsp";
	}

	@RequestMapping("/login.do")
	public String validateAndLogin(@ModelAttribute("dto") @Valid LoginDTO loginDTO, BindingResult result,
			HttpServletRequest request) {
		validator.validate(loginDTO, result);
		if (result.hasErrors()) {
			System.out.println("invalid data");
			request.setAttribute("dto", new LoginDTO());
			return "/Login.jsp";
		}

		System.out.println("inside validateAndLogin");
		System.out.println("login dto \t" + loginDTO);
		return "/Home.jsp";
	}

}
