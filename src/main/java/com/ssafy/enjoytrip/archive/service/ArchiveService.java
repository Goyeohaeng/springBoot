package com.ssafy.enjoytrip.archive.service;

import java.util.List;

import com.ssafy.enjoytrip.archive.dto.ArchiveDto;

public interface ArchiveService {
	// 리스트 가져오기 
		List<ArchiveDto> getArchiveList(String userId);
		// 추가하기 
		int insertArchive(ArchiveDto dto);
		// 삭제하기 
		int deleteArchive(int archiveId);
}
