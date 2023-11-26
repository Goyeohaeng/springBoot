package com.ssafy.enjoytrip.common;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.ssafy.enjoytrip.user.dto.UserDto;

// 클라이언트에 대한 응답 성공/ 실패를 json 문자열로 내려줌 
// "result" : "success"
// "result" : "fail"

// "result" : "login" <- 으로 보내면 => login page로 보내도록 하자 (front)

@Component
public class LoginInterceptor implements HandlerInterceptor {

	private final String jsonStr = "{\"result\" : \"login\"}";

	// dispatcher servlet을 통과하는 애들은 controller 가기 전 무조건 prehandle를 무조건 거침
	// 이때 설정을 통해 거치는 애들, 안거치는 애들을 설정할 수 있음
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
//		System.out.println("LoginInterceptor >>>> " + request.getRequestURI());
//
//		// jsp를 쓸때는 (page요청, 비동기 요청이 있음) -> 지금 spring boot는 비동기 요청만 있음
//		HttpSession session = request.getSession();
//		UserDto dto = (UserDto) session.getAttribute("userDto");
//		if (dto == null) {
//			// 로그인이 필요하다는 응답을 준다
//			response.getWriter().write(jsonStr);
//			return false;
//		}

		return true;

	}

}
