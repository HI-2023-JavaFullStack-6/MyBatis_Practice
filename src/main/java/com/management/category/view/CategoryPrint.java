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
        System.out.println(SuccessMessage);

    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        System.out.println(errorMessage);

    }

}
