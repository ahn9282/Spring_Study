package edu.sejong.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	
	@RequestMapping("/view")
	public String memberView(Model model,HttpServletRequest request) {
		System.out.println("memberView()...");
		model.addAttribute("id",request.getParameter("id"));
		model.addAttribute("pw",request.getParameter("pw"));
		model.addAttribute("name",request.getParameter("name"));
		model.addAttribute("email",request.getParameter("email"));
		model.addAttribute("age",request.getParameter("age"));
		return "member/register";
	}
}
