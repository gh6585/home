package spring.home.ms.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.home.ms.domain.Board;
import spring.home.ms.domain.Member;
import spring.home.ms.service.BoardService;

@Controller
@RequestMapping("/board")
public class boardController {
	
	HashMap<Board, Object> boardup = new HashMap<>();
	BoardService boardService;
	
	public boardController(BoardService boardService) {
		
		this.boardService = boardService;
		
		
	}
	
	
	
	
	@RequestMapping("list")
	public void list(Model model) {
	
		List<Board> list = boardService.boardList();
		model.addAttribute("list",list);
	}
	
	@RequestMapping("form")
	public void form() {}
	
	
	@RequestMapping("add")
	public void add(Board board,@RequestParam Member nik) {

		
	}
	
	
	
}
