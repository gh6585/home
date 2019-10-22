package spring.home.ms.dao;

import java.util.List;
import java.util.Map;

import spring.home.ms.domain.Board;

public interface BoardDao {

	List<Board> getList();
	void insert(Map<String, Object> board);
}
