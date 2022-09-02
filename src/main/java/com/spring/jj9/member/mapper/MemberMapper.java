package com.spring.jj9.member.mapper;

import java.util.List;

import com.spring.jj9.dto.Member;

public interface MemberMapper {
	
	public List<Member> getList();
	
	public Integer insert(Member member);

	public Integer getId(String member_id);
	
	public Integer idChecker(String ID);
	
	public Integer login(String member_id, String member_password);
}
