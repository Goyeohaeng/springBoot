package com.ssafy.enjoytrip.archive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.archive.dao.ArchiveDao;
import com.ssafy.enjoytrip.archive.dto.ArchiveDto;

@Service
public class ArchiveServiceImpl implements ArchiveService {

	@Autowired
	ArchiveDao dao;
	@Override
	public List<ArchiveDto> getArchiveList(String userId) {
		// TODO Auto-generated method stub
		return dao.getArchiveList(userId);
	}

	@Override
	public int insertArchive(ArchiveDto dto) {
		// TODO Auto-generated method stub
		return dao.insertArchive(dto);
	}

	@Override
	public int deleteArchive(int archiveId) {
		// TODO Auto-generated method stub
		return dao.deleteArchive(archiveId);
	}

}
