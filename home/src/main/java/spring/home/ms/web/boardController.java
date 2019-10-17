package spring.home.ms.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.home.ms.domain.Board;
import spring.home.ms.service.BoardService;

@Controller
@RequestMapping("/board")
public class boardController {
	
	BoardService boardService;
	
	public boardController(BoardService boardService) {
		
		this.boardService = boardService;
		
		
	}
	
	
	
	
	@RequestMapping("boardList")
	public void boardList(Model model) {
	
		List<Board> list = boardService.boardList();
		model.addAttribute("list",list);
	}
	
}
