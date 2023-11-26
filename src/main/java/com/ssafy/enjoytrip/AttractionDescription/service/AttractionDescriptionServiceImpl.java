package com.ssafy.enjoytrip.AttractionDescription.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.AttractionDescription.dao.AttractionDescriptionDao;
import com.ssafy.enjoytrip.AttractionDescription.dto.AttractionDescriptionDto;
import com.ssafy.enjoytrip.AttractionInfo.dto.AttractionInfoDto;
import com.ssafy.enjoytrip.Sido.dto.SidoDto;

@Service
public class AttractionDescriptionServiceImpl implements AttractionDescriptionService{

	AttractionDescriptionDao dao; 
	
	public AttractionDescriptionServiceImpl(AttractionDescriptionDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<AttractionInfoDto> AttractionInfoList(Map<String, String> map) {
		// FIXME
		// 로그인 된 유저가 검색하는 경우
		if (map.containsKey("userId")) {
			System.out.println("userId가 " + map.get("userId") + "인 유저가 장소 검색 중" );
			return dao.AttractionInfoList(map);
		}
		
		// 로그인 되지 않았을 때 검색하는 경우
		else {
			System.out.println("로그인 되지 않은 유저가 장소 검색 중");
			return dao.AttractionInfoAllList(map);
		}
		
	}

	@Override
	public AttractionDescriptionDto getAttractionDetail(int contentId) {
		return dao.getAttractionDetail(contentId);
	}

	@Override
	public List<SidoDto> getSido() {
		return dao.getSido();
	}

	@Override
	public List<AttractionInfoDto> AttractionInfoReviewList(Map<String, String> map) {
		return dao.AttractionInfoReviewList(map);
	}

	@Override
	public List<AttractionInfoDto> getRecommendLoc(Double latitude, Double longitude) {
		// TODO Auto-generated method stub
		return dao.getRecommendLoc(latitude, longitude);
	}

	@Override
	public Integer getIsBookmarked(String userId, int contentId) {
		// TODO Auto-generated method stub
		return dao.getIsBookmarked(userId, contentId);
	}
	
}
