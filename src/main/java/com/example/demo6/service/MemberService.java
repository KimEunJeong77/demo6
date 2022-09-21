package com.example.demo6.service;

import java.util.List;
import com.example.demo6.dto.MemberDTO;

public interface MemberService {
	List<MemberDTO> findMemberList();
	MemberDTO findMemberDetail(String id);
}
