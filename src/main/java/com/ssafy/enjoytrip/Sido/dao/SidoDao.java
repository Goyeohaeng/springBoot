package com.ssafy.enjoytrip.Sido.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.enjoytrip.Sido.dto.SidoDto;


public interface SidoDao {
	List<SidoDto> sidoList();
}
