package com.management.category.view;

import com.management.category.model.dto.CategoryDTO;

import java.util.List;
import java.util.Map;

public class CategoryPrint {

    public void printTeamList(List<CategoryDTO> categoryList, Map<String, String> parameter) {

        if ("allList".equals(parameter.get("option"))) {
            System.out.println("=========== 전체 제품분류 정보 조회 결과 ===========");
        } else {
            System.out.println("=========== 순위별 제품분류 정보 조회 결과 ===========");
        }

        for(CategoryDTO list : categoryList) {
            System.out.println(list);
        }
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch (successCode) {
            case "insert" : successMessage = "신규 제품분류 정보 등록에 성공하였습니다."; break;
            case "update" : successMessage = "제품분류명 수정에 성공하였습니다."; break;
            case "delete" : successMessage = "판매부진 제품군 삭제에 성공하였습니다."; break;
        }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "select" : errorMessage = "제품 정보 조회에 실패하였습니다."; break;
            case "insert" : errorMessage = "신규 제품분류 정보 등록에 성공하였습니다."; break;
            case "update" : errorMessage = "제품분류명 수정에 성공하였습니다."; break;
            case "delete" : errorMessage = "판매부진 제품군 삭제에 성공하였습니다."; break;
        }
        System.out.println(errorMessage);
    }
}
