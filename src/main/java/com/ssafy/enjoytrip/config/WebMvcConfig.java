package com.ssafy.enjoytrip.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ssafy.enjoytrip.common.LoginInterceptor;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{	
	
	@Autowired
	LoginInterceptor loginInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loginInterceptor)
		.addPathPatterns("/**") // user/ 다 포함 
		.excludePathPatterns(
				"/", 
				"/login/**",
				"/users/**",
				"/codes/**", 
				"/css/**",
				"/js/**",
				"/img/**",
				"/favicon.ico"
				);  // login, 회원가입, root, 공통코드, css 등  빼주기 
	}
	
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")
                // options를 넣어주지 않아면 preflight 과정에서 오류가 날 수 있음 
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3000);
    }
}
