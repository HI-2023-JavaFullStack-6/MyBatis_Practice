package com.management.category.view;

import com.management.category.model.dto.CategoryDTO;

import java.util.List;
import java.util.Map;

public class CategoryPrint {

    public void printTeamList(List<CategoryDTO> categoryList, Map<String, String> parameter) {

        String printList = "";

        String option = parameter.get("option");

        switch (option) {
            case "allList" : printList = "전체 목록 조회"; break;
            case "orderList" : printList = "순위별 제품분류 조회"; break;
        }
        System.out.println(printList);

        for (CategoryDTO category : categoryList){
            System.out.println(category);
        }


    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";

        switch (successCode){
            case "registNewCategory" : successMessage = "입력하신 카텍고리 등록이 성공했습니다."; break;
            case "modifyCategoryName" : successMessage = "입력하신 카텍고리 수정이 성공했습니다."; break;
            case "deleteCategory" : successMessage = "입력하신 카테고리 삭제가 성공했습니다."; break;
        }

        System.out.println(successMessage);

    }

    public void printErrorMessage(String errorCode) {


        String errorMessage = "";

        switch (errorCode){
            case "selectCategoryList" : errorMessage = "전체 메뉴 조회를 실패했습니다."; break;
            case "registNewCategory" : errorMessage = "입력하신 카테고리 등록이 성공했습니다."; break;
            case "modifyCategoryName" : errorMessage = "입력하신 카테고리 수정이 성공했습니다."; break;
            case "deleteCategory" : errorMessage = "입력하신 카테고리 삭제가 성공했습니다."; break;
        }

        System.out.println(errorMessage);

    }

}
