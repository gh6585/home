package spring.home.ms.service;

import java.util.List;
import java.util.Map;

import spring.home.ms.domain.Board;

public interface BoardService {
	
	List<Board> boardList();
	void add(Map<String, Object> board);
	
}
