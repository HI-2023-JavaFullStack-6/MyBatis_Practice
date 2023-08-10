package com.management.category.view;

import com.management.category.model.dto.CategoryDTO;

import java.util.List;
import java.util.Map;

public class CategoryPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // * 주석을 지우고 다음 세 가지 메소드를 작성하세요.

    public void printTeamList(List<CategoryDTO> categoryList, Map<String, String> parameter) {

        for(CategoryDTO cate : categoryList) {
            System.out.println(cate);
        }

    }

    public void printSuccessMessage(String successCode) {
        String SuccessMessage = "";

        switch (successCode) {
            case "insert" : SuccessMessage = "신규 제품 등록 성공"; break;
            case "update" : SuccessMessage = "제품 정보 수정 성공"; break;
            case "delete" : SuccessMessage = "제품 정보 삭제 성공"; break;
        }
        
        System.out.println(SuccessMessage);

    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectCategoryList" : errorMessage = "제품 목록 조회 실패"; break;
            case "insert" : errorMessage = "신규 제품 등록 실패"; break;
            case "update" : errorMessage = "제품 정보 수정 실패"; break;
            case "delete" : errorMessage = "제품 정보 삭제 실패"; break;
        }

        System.out.println(errorMessage);

    }

}
