package spring.home.ms.service;

import java.util.List;

import spring.home.ms.domain.Board;

public interface BoardService {
	
	List<Board> boardList();
	void add(Board board);
	
}
