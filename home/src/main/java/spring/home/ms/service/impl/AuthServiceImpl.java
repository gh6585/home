package spring.home.ms.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

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

	@Override
	public String getres(String res) {
		
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(res);
		
		JsonElement kakaores = element.getAsJsonObject().get("nikname");
		
		System.out.println(kakaores);
		
		
		return null;
	}

	
	
	
	

}
