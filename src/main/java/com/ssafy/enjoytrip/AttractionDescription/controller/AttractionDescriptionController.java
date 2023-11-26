package com.ssafy.enjoytrip.AttractionDescription.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.enjoytrip.AttractionDescription.dto.AttractionDescriptionDto;
import com.ssafy.enjoytrip.AttractionDescription.service.AttractionDescriptionService;
import com.ssafy.enjoytrip.AttractionInfo.dto.AttractionInfoDto;
import com.ssafy.enjoytrip.Sido.dto.SidoDto;
import com.ssafy.enjoytrip.user.dto.UserDto;

@RestController
@RequestMapping("/locations")
public class AttractionDescriptionController {

	AttractionDescriptionService service;

	public AttractionDescriptionController(AttractionDescriptionService service) {
		super();
		this.service = service;
	}

	// 검색해서 가져오기
	// FIXME 로그인 된 유저의 아이디가 필요
	@GetMapping("/lists")
	List<AttractionInfoDto> AttractionInfoList(@RequestParam(value = "sidoCode", required = false) Integer sidoCode,
			@RequestParam(value = "contentTypeId", required = false) Integer contentTypeId,
			@RequestParam(value = "keyword", required = false) String keyword, HttpSession session) {
		System.out.println("location list 가져오기");
		List<AttractionInfoDto> list = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		System.out.println(sidoCode + "," + contentTypeId + "," + keyword);
		if (sidoCode != null) {
			// string으로 바꿔주기
			map.put("sidoCode", sidoCode.toString());
		}
		if (contentTypeId != null) {
			// string으로 바꿔주기
			map.put("contentTypeId", contentTypeId.toString());
		}

		if (keyword != null) {
			map.put("keyword", keyword);
		}

		UserDto userDto = (UserDto) session.getAttribute("user");

		if (userDto != null) {
			map.put("userId", userDto.getUserId());
		}

		list = service.AttractionInfoList(map);

		return list;
	}

	// 리뷰 가져오기
	@GetMapping("/lists/review")
	List<AttractionInfoDto> AttractionInfoListReview(
			@RequestParam(value = "sidoCode", required = false) Integer sidoCode,
			@RequestParam(value = "contentTypeId", required = false) Integer contentTypeId,
			@RequestParam(value = "keyword", required = false) String keyword) {
		System.out.println("location review 가져오기");
		List<AttractionInfoDto> list = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		System.out.println(sidoCode + "," + contentTypeId + "," + keyword);
		if (sidoCode != null) {
			// string으로 바꿔주기
			map.put("sidoCode", sidoCode.toString());
		}
		if (contentTypeId != null) {
			// string으로 바꿔주기
			map.put("contentTypeId", contentTypeId.toString());
		}
		if (keyword != null) {
			map.put("keyword", keyword);
		}
		list = service.AttractionInfoReviewList(map);
		return list;
	}

	// 상세 가져오기
	@GetMapping("/info/{contentId}")
	AttractionDescriptionDto getAttractionDetail(@PathVariable int contentId) {
		System.out.println("info 가져오기");
		AttractionDescriptionDto dto = null;
		dto = service.getAttractionDetail(contentId);
		return dto;
	}

	// 상세 가져오기
	@GetMapping("/sido")
	List<SidoDto> getSido() {
		System.out.println("info 가져오기");
		List<SidoDto> dto = null;
		dto = service.getSido();
		return dto;
	}

	// 리뷰 가져오기
	@GetMapping("/lists/recommend")
	List<AttractionInfoDto> AttractionInfoListReview(
			@RequestParam(value = "latitude", required = false) Double latitude,
			@RequestParam(value = "longitude", required = false) Double longitude) {
		List<AttractionInfoDto> list = new ArrayList<>();
		list = service.getRecommendLoc(latitude, longitude);
		return list;
	}

	// 리뷰 가져오기
	@GetMapping("/isBookmarked")
	Map<String, String> AttractionInfoListReview(@RequestParam(value = "contentId", required = false) int contentId, HttpSession session) {
		UserDto user = (UserDto) session.getAttribute("user");
		Map<String, String> map = new HashMap<>();
		if(user == null) {
			map.put("result", "fail");
			System.out.println("userIsNull");
			return map ;
		}else{
			map.put("result", "success");
			Integer result = service.getIsBookmarked(user.getUserId(), contentId);
			if(result == null) {
				map.put("bookmarkId", "empty" );
			}else {
				map.put("bookmarkId", String.valueOf(result));
			}
			return map;
		}
		
	}
}
