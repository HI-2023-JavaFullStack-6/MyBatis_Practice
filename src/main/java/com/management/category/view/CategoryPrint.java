package com.management.category.view;

import com.management.category.model.dto.CategoryDTO;
import com.management.category.model.service.CategoryService;

import java.util.List;
import java.util.Map;

public class CategoryPrint {

    public void printTeamList(List<CategoryDTO> categoryList, Map<String, String> parameter) {


        if(parameter.get("option") == "allList") {
            for (CategoryDTO list : categoryList) {
                System.out.println(list);
            }
        }else if(parameter.get("option") == "orderList"){
            for (CategoryDTO list : categoryList){
                System.out.println(list);
            }
        }
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode){
           //case "insert" : successMessage = "추가 성공"; break;
            case  "regist" : successMessage = "등록 성공"; break;
            case  "modify" : successMessage = "수정 성공"; break;
            case  "delete" : successMessage = "삭제 성공"; break;

        }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode){
            //  case "selectAll" : errorMessage = "전체메뉴 조회 실패"; break;
            case  "select" : errorMessage = "전체 조회 실패"; break;
            case "regist" : errorMessage = "등록 실패"; break;
            case "modify" : errorMessage = "수정 실패"; break;
            case  "delete" : errorMessage = "삭제 실패"; break;
        }
        System.out.println(errorMessage);
    }

}
