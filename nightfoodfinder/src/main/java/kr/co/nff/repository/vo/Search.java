package kr.co.nff.repository.vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Search extends Pagination {
	
	public Search() {
		super();
	}
	
	public Search(int pageNo, int listSize) {
		super(pageNo, listSize);
	}
	private String totalType;
	private String type;  
	private String types;  // 다중 type 검색
	private String keyword;  // 검색어          (이름, 지역, 메뉴 예정 - 스토어리스트)
	private int[] categoryCode; // 카테고리 : 중복허용
	private int[] priceTypeNo; // 가격대 : 중복허용
	private String[] cities; // 주소 : 중복허용 (구단위)
	private String[] ageCode; // 나이대 : 중복허용
	private int includeClosed; // 영업끝난 가게 결과 포함하기 (1인 경우만 포함)
	private String userAge; // 나이대 (중복 x)
	private int count; // 검색 시 상위 몇 개까지 출력할지 입력
	private String filter;
	private List<String[]> filters;
	
	private int storeNo;
	private int userNo;
	
	//award에서 top10 list
	private String storeNoList;
	
	private String userGender;
	private int genderType;
	
	private String longitude;
	private String latitude;
	
	// 그냥 검색인지, 내주변 맛집 기능인지 구분(1: 검색, 2: 내주변 맛집)
	private int flag;

	
	// 리스트 정렬
	public void setFilters(String ...strings) {
		List<String[]> list = new ArrayList<>();
		for(String filter : strings) {			
			switch (filter) {
			case "평점":
				list.add(new String [] {"scope",filter});
				break;
			case "조회수":
				list.add(new String [] {"seeCnt",filter});
				break;
			case "리뷰수":
				list.add(new String [] {"rcount",filter});
				break;
			}
		}
		
		this.filters = list;
	}
	
}
