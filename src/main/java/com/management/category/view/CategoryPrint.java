package com.management.category.view;

import com.management.category.model.dto.CategoryDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryPrint {


    public void printTeamList(List<CategoryDTO> categoryList, Map<String, String> parameter) {



        if("orderList".equals(parameter.get("option"))){
            System.out.println("순위별 제품분류 목록입니다.");
        }else{
            System.out.println("전체 제품분류 목록");
        }

        for(CategoryDTO category : categoryList){
            System.out.println(category);
        }

    }

    public void printSuccessMessage(String successCode) {


        String successMessage = "";

        switch (successCode){
            case "registNewCategory" : successMessage = "신규 메뉴 등록에 성공했습니다."; break;
            case "modifyCategoryName" : successMessage = "메뉴 수정에 성공했습니다."; break;
            case "deleteCategory" : successMessage = "메뉴 삭제에 성공했습니다."; break;

        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {



        String errorMessage = "";

        switch (errorCode){
            case "selectCategoryList" : errorMessage = "조회하신 정보가 없습니다."; break;
            case "registNewCategory" : errorMessage = "신규 메뉴 등록에 실패했습니다."; break;
            case "modifyCategoryName" : errorMessage = "메뉴 수정에 실패했습니다."; break;
            case "deleteCategory" : errorMessage = "메뉴 삭제에 성공했습니다."; break;
        }

        System.out.print(errorMessage);
    }

}
