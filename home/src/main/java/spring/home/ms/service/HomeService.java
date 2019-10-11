package spring.home.ms.service;

import java.util.List;

import spring.home.ms.domain.Home;
import spring.home.ms.domain.Member;

public interface HomeService {
	   
	Home getlist(int no);
	List<Member> userList();
	void add(Member member);
}
  