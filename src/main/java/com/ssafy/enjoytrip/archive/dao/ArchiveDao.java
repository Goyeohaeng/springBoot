package com.ssafy.enjoytrip.archive.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.enjoytrip.archive.dto.ArchiveDto;

@Mapper
public interface ArchiveDao {

	// 리스트 가져오기 
	List<ArchiveDto> getArchiveList(String userId);
	// 추가하기 
	int insertArchive(ArchiveDto dto);
	// 삭제하기 
	int deleteArchive(int archiveId);
}
