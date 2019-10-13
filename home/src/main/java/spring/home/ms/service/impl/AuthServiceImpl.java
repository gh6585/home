package spring.home.ms.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.home.ms.dao.MemberDao;
import spring.home.ms.domain.Member;
import spring.home.ms.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService{

	@Autowired
	MemberDao memberDao;

	@Override
	public Member getMember(String email, String password) {

		HashMap<String, Object> params = new HashMap<>();
		
		params.put("email", email);
		params.put("password",password);
		
		return memberDao.findEmail(params);
	}
	
	
	
	

}
