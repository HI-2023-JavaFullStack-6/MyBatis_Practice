package com.management.category.view;

import com.management.category.model.dto.CategoryDTO;

import java.util.List;
import java.util.Map;

public class CategoryPrint {

    public void printTeamList(List<CategoryDTO> categoryList, Map<String, String> parameter) {


        if("orderList".equals(parameter.get("option"))) {
            System.out.println("=====순위별 제품 분류 목록====");
        } else {
            System.out.println("=====전체 제품분류 목록=====");
        }

            for(CategoryDTO category : categoryList) {
                System.out.println(category);
            }
        System.out.println("============");
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";

        switch(successCode) {
            case "registCategory" : successMessage = "신규 제품분류를 등록하였습니다"; break;
            case "modifyCategory" : successMessage = "제품분류명을 정상적으로 수정하였습니다."; break;
            case "deleteCategory" : successMessage = "판매부진 제품분류를 삭제하였습니다"; break;


        }
        System.out.println(successMessage);
        System.out.println("===================================");

    }

        // 2. 성공메시지를 출력하는 메소드
        //    (조건) 성공코드를 전달받아 각각의 요청에 대해 성공을 알리는 메시지를 출력하세요.



    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectCategoryList" : errorMessage = "조회 결과가 없습니다.)"; break;
            case "registCategory" : errorMessage = "신규 제품분류 등록을 실패하였습니다. 다시 시도해 주세요."; break;
            case "modifyCategory" : errorMessage = "제품분류명 수정을 실패하였습니다. 다시 시도해 주세요."; break;
            case "deleteCategory" : errorMessage = "제품분류 삭제를 실패하였습니다. 다시 시도해 주세요."; break;
        }

        System.out.println(errorMessage);
        System.out.println("====================");

        // 3. 에러메시지를 출력하는 메소드
        //    (조건) 에러코드를 전달받아 각각의 요청에 대해 에러를 알리는 메시지를 출력하세요.

    }

}
