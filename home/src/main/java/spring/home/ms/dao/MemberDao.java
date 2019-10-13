package spring.home.ms.dao;

import java.util.List;
import java.util.Map;

import spring.home.ms.domain.Home;
import spring.home.ms.domain.Member;

public interface MemberDao {
	Home findHome(int no);
	List<Member> userList();
	void insert(Member member);
	Member findEmail(Map<String, Object> params);
	
}
