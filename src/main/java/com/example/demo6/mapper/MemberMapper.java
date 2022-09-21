package com.example.demo6.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo6.dto.MemberDTO;
@Mapper
public interface MemberMapper {
	List<MemberDTO> selectMemberList();
	MemberDTO selectMemberDetail(@Param("paramId") String id);
}