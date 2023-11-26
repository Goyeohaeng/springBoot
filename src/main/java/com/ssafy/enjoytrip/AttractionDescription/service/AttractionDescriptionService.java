package com.ssafy.enjoytrip.AttractionDescription.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ssafy.enjoytrip.AttractionDescription.dto.AttractionDescriptionDto;
import com.ssafy.enjoytrip.AttractionInfo.dto.AttractionInfoDto;
import com.ssafy.enjoytrip.Sido.dto.SidoDto;

public interface AttractionDescriptionService {
	List<AttractionInfoDto> AttractionInfoList(Map<String, String> map);
	List<AttractionInfoDto> AttractionInfoReviewList(Map<String, String> map);
	AttractionDescriptionDto getAttractionDetail(int contentId);
	List<SidoDto> getSido();
	List<AttractionInfoDto> getRecommendLoc(@Param("latitude") Double latitude,@Param("longitude") Double longitude );
	Integer getIsBookmarked(@Param("userId") String userId, @Param("contentId") int contentId);

}
