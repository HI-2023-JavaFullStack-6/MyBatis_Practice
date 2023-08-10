package com.management.category.view;

import com.management.category.model.dto.CategoryDTO;

import java.util.List;
import java.util.Map;

public class CategoryPrint {

    public void printTeamList(List<CategoryDTO> categoryList, Map<String, String> parameter) {

        String teamList = "";

        String parameterOption = parameter.get("option");

        switch (parameterOption) {
            case "allList" : teamList = "전체 목록 조회 성공"; break;
            case "orderList" : teamList = "순위별 제품분류 조회 성공"; break;
        }

        for(CategoryDTO category : categoryList) {
            System.out.println(category);
        }

        System.out.println(teamList);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";

        switch (successCode) {
            case "insert" : successMessage = "제품분류코드 등록 성공"; break;
            case "update" : successMessage = "제품분류코드 수정 성공"; break;
            case "delete" : successMessage = "제품분류코드 삭제 성공"; break;
        }

        System.out.println(successMessage);

    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "select" : errorMessage = "조회 결과 없음"; break;
            case "insert" : errorMessage = "제품분류코드 등록 실패"; break;
            case "update" : errorMessage = "제품분류코드 수정 실패"; break;
            case "delete" : errorMessage = "제품분류코드 삭제 실패"; break;
        }

        System.out.println(errorMessage);

    }

}
