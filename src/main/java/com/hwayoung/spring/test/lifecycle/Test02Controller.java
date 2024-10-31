package com.hwayoung.spring.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test02")
public class Test02Controller {
//	@ResponseBody
	@RequestMapping("/1")
	public List<Map<String, Object>> listResponse() {
		Map<String, Object> movieInfo = new HashMap<>();
		List<Map<String, Object>> movieList = new ArrayList<>();
		movieInfo.put("rate", 15);
		movieInfo.put("director", "봉준호");
		movieInfo.put("time", 131);
		movieInfo.put("title", "기생충");
		movieList.add(movieInfo);

		movieInfo = new HashMap<>();
		movieInfo.put("rate", 0);
		movieInfo.put("director", "로베르토 베니니");
		movieInfo.put("time", 116);
		movieInfo.put("title", "인생은 아름다워");
		movieList.add(movieInfo);

		
		movieInfo = new HashMap<>();
		movieInfo.put("rate", 12);
		movieInfo.put("director", "크리스토퍼 놀란");
		movieInfo.put("time", 147);
		movieInfo.put("title", "인셉션");
		movieList.add(movieInfo);

		
		movieInfo = new HashMap<>();
		movieInfo.put("rate", 19);
		movieInfo.put("director", "윤종빈");
		movieInfo.put("time", 133);
		movieInfo.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		movieList.add(movieInfo);

		
		movieInfo = new HashMap<>();
		movieInfo.put("rate", 15);
		movieInfo.put("director", "프란시스 로렌스");
		movieInfo.put("time", 137);
		movieInfo.put("title", "헝거게임");
		movieList.add(movieInfo);
		
		return movieList;
		
	}
	
	@RequestMapping("/2")
	public List<Map<String, Object>> memberListResponse() {
		
		
		List<Map<String, Object>> memberList = new ArrayList<>();
		
		Map<String, Object> memberInfo = new HashMap<>();
		
		memberInfo.put("title", "안녕하세요. 가입인사 드립니다.");
		memberInfo.put("user", "jaeseok");
		memberInfo.put("content", "안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		memberList.add(memberInfo);
		
		memberInfo = new HashMap<>();
		memberInfo.put("title", "헐 대박");
		memberInfo.put("user", "bada");
		memberInfo.put("content", "오늘 목요일이 었어... 금요일 인줄");
		memberList.add(memberInfo);
		
		memberInfo = new HashMap<>();
		memberInfo.put("title", "오늘 데이트 한 이야기 해드릴게요");
		memberInfo.put("user", "dulumary");
		memberInfo.put("content", "....");
		memberList.add(memberInfo);
		
		
		return memberList;
	}
	
	@RequestMapping("/3")
	public ResponseEntity<List<Map<String, Object>>> entityResponse() {
		List<Map<String, Object>> memberList = new ArrayList<>();
		
		Map<String, Object> memberInfo = new HashMap<>();
		
		memberInfo.put("title", "안녕하세요. 가입인사 드립니다.");
		memberInfo.put("user", "jaeseok");
		memberInfo.put("content", "안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		memberList.add(memberInfo);
		
		ResponseEntity<List<Map<String, Object>>> entity = new ResponseEntity(memberList, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
	
	
	

}
