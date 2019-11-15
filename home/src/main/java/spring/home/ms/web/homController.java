package spring.home.ms.web;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.home.ms.domain.Home;
import spring.home.ms.domain.Member;
import spring.home.ms.service.AuthService;
import spring.home.ms.service.HomeService;



@Controller
@RequestMapping("/home")
public class homController {
	
	HomeService homeService; 
	AuthService authService;
	ServletContext sc;
	
	
	public homController(HomeService homeService,AuthService authService,ServletContext sc) {
		this.homeService = homeService;
		this.authService =authService;
		this.sc = sc;
	}
	
	
	@GetMapping("main")
	public Home main(int no) {
		
		Home h = homeService.getlist(no);
		
		return h;
	}
	
	@GetMapping("list")
	public void list(Model model) {
		
		List<Member> list = homeService.userList();
		model.addAttribute("list",list);
		
	}
	@GetMapping("form")
	public void form(String res) {
		
		if(res != null) {
			authService.getres(res);
			
		}
	}
	
	
	
	@PostMapping("add")
	public String add(Member member) {
		homeService.add(member);
		
		return "redirect:../auth/signupend";
	}
	

		

	
	
	
	
	
}
