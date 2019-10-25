package spring.home.ms.dao;

import java.util.List;

import spring.home.ms.domain.Board;

public interface BoardDao {

	List<Board> getList();
	Board insert(Board board,String nik);
}
