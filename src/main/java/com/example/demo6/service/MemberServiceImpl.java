package com.example.demo6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo6.dto.MemberDTO;
import com.example.demo6.mapper.MemberMapper;


@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public List<MemberDTO> findMemberList() {
		// TODO Auto-generated method stub
		return memberMapper.selectMemberList();
	}
	
	@Override
	public MemberDTO findMemberDetail(String id) {
		// TODO Auto-generated method stub
		return memberMapper.selectMemberDetail(id);
	}
}

