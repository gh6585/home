package spring.home.ms.service;

import spring.home.ms.domain.Member;

public interface AuthService {
	
	Member getMember(String id,String password);
}
