package spring.home.ms.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.home.ms.dao.BoardDao;
import spring.home.ms.domain.Board;
import spring.home.ms.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardDao boardDao;
	
	@Override
	public List<Board> boardList() {
		return boardDao.getList();
	}

	@Override
	public void add(Map<String, Object> board) {
		
		boardDao.insert(board);
	}

	

}
