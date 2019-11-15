package spring.home.ms.web;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.home.ms.domain.Member;
import spring.home.ms.service.AuthService;

@Controller
@RequestMapping("/auth")
public class AuthController {
	
	AuthService authService;
	
	public AuthController(AuthService authService) {
		this.authService = authService;
		
	}
	
	@RequestMapping("/signupend")
	public void signupEnd(){
		
		
	}
	
	@RequestMapping("/form")
	public void form() {} 
	
	@RequestMapping("/login")
	public String login(String email,String password,HttpSession session) {
		
		
		Member loginUser = authService.getMember(email, password);
		
		
		if(loginUser != null) {
			
			session.setAttribute("loginUser", loginUser);
			return "redirect:../home/list";
		}
		return "redirect:form";
	} 
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:../home/list";
	}
	
	@RequestMapping("kakaologin")
	public String kakaologin(String res,HttpSession session) {
		
		authService.getres(res);
		return "";
	}
	
}
