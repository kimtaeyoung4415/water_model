package com.water.model.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service("CommonUtil")
public class CommonUtil {
	
	// 현재 시간
	public String getCurrentTime(){	
		SimpleDateFormat dateformat = new SimpleDateFormat ("yyyy-MM-dd");
		Date time = new Date();
		String now = dateformat.format(time);
		
		return now;
	}
	
	// 페이징 액션
	public String pagination(Map<String, Object> param, HttpServletRequest request) {		
		
		// ex) url = admin/ntce/list.do >>  url?showPage=2&perPage=15
		String url = request.getRequestURI();
		
		// url 처리
		String lastStr = url.substring(url.length()-1);
		
		if (!"?".equals(lastStr)) {
			url += "?";
		}
	
		int crrPage   = 0;	// 선택한 페이지
		int totalPage = 0;	// 총 페이지 수(웹브라우저상에 보여줄 총 페이지 갯수, 페이지바)
		int showPage  = 1;	// 초기페에이지는 0로 설정함
		
		int totalCount = (int) param.get("totalCount");					// 총 게시물 수
		int perPage = (int) param.get("perPage");	// 페이지당 보여줄 게시물 
		int perBar  = (int) param.get("perBar");	// 페이징 블럭에 보여질 수     ex) 5 >> | 1 | 2 | 3 | 4 | 5 |
						
		// p_k >> 페이징 선택 여부
		if (param.get("p_k") != null) {
			crrPage = (int) param.get("showPageNo");
		} else {
			crrPage =  0;
		}
				
		// 전체 페이지 수 
		totalPage = (int) Math.ceil( (double)totalCount/perPage );
		
		// 첫 로드 또는 선택하지 않은 경우 
		if (crrPage == 0) { 			
			showPage = 1; 
		} else { 
		// 페이지 선택한 경우
			try {
				showPage = crrPage;				
		
				if (showPage < 1 || showPage > totalPage) { 
					showPage = 1; 
				} 
			} catch (Exception e) { 
				showPage = 1; 
			} 
		} 

		// perBar 반복용
		int loop = 1; 
		
		// 페이지 번호
		int pageNo = (( showPage - 1 ) / perBar) * perBar + 1 ;
				
		// 페이징 html 소스 생성
		String pageBar = "";
		
		pageBar += "<ul>";
		
		// 이전 버튼
		if (pageNo!=1) {
			pageBar += "<a href='"+url+"&showPage="+(showPage - perBar + (pageNo - showPage))+"&perPage="+perPage+"'> < </a>";
		}
		
		// 페이지바
		while (!( loop > perBar || pageNo > totalPage ) ) {

			if (pageNo == showPage) {
				pageBar += "<a class="+"a_active"+" href='"+url+"&showPage="+pageNo+"&perPage="+perPage+"' >"+pageNo+"</a>";
			} else {
				pageBar += "<a class='paging' href='"+url+"&showPage="+pageNo+"&perPage="+perPage+"'>"+pageNo+"</a>";
			}
			
			loop++;
			pageNo++;
		}
		
		// 다음 버튼
		if ( !(pageNo > totalPage) ) {
			pageBar += "<a href='"+url+"&showPage="+(pageNo)+"&perPage="+perPage+"'> > </a>";	
		}
		
		pageBar += "</ul>";		
		
		return pageBar;
	}

}
