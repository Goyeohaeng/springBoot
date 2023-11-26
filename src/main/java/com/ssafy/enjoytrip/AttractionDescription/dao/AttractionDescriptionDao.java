package com.ssafy.enjoytrip.AttractionDescription.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.enjoytrip.AttractionDescription.dto.AttractionDescriptionDto;
import com.ssafy.enjoytrip.AttractionInfo.dto.AttractionInfoDto;
import com.ssafy.enjoytrip.Sido.dto.SidoDto;

@Mapper
public interface AttractionDescriptionDao {
	
	List<AttractionInfoDto> AttractionInfoList(Map<String, String> map); // 로그인 된 유저가 장소를 검색하는 경우
	List<AttractionInfoDto> AttractionInfoAllList(Map<String, String> map); // 로그인 되지 않은 상태에서 장소를 검색하는 경우
	List<AttractionInfoDto> AttractionInfoReviewList(Map<String, String> map); // 후기 찾기 
	AttractionDescriptionDto getAttractionDetail(int contentId);	// 상세보기 
	List<SidoDto> getSido(); // 시도
	List<AttractionInfoDto> getRecommendLoc(@Param("latitude") Double latitude,@Param("longitude") Double longitude );
	Integer getIsBookmarked(@Param("userId") String userId, @Param("contentId") int contentId);
}
