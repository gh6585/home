package spring.home.ms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.home.ms.dao.MemberDao;
import spring.home.ms.domain.Home;
import spring.home.ms.domain.Member;
import spring.home.ms.service.HomeService;


@Service
public class HomServiceImpl implements HomeService{

	@Autowired MemberDao memberDao;
	
	@Transactional
	@Override
	public Home getlist(int no) {
		return memberDao.findHome(no);
	}

	@Override
	public List<Member> userList() {
		return memberDao.userList();
	}

	@Override
	public void add(Member member) {
		memberDao.insert(member);
	}

}
