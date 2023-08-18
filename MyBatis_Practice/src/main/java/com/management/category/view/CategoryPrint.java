package com.management.category.view;

import com.management.category.model.dto.CategoryDTO;

import java.util.List;
import java.util.Map;

public class CategoryPrint {



    public void printTeamList(List<CategoryDTO> categoryList, Map<String, String> parameter) {


        System.out.println("============= Category List =============");

        if ("all".equalsIgnoreCase(parameter.toString())) {
            for (CategoryDTO category : categoryList) {
                System.out.println(category);
            }
        } else if ("rank".equalsIgnoreCase(parameter.toString())) {
            int rank = 1;
            for (CategoryDTO category : categoryList) {
                System.out.println("Rank " + rank + ": " + category);
                rank++;
            }
        } else {
            System.out.println("Invalid viewType parameter");
        }
    }

    public void printSuccessMessage(String successCode) {

        // 2. 성공메시지를 출력하는 메소드
        //    (조건) 성공코드를 전달받아 각각의 요청에 대해 성공을 알리는 메시지를 출력하세요.

    }

    public void printErrorMessage(String errorCode) {

        // 3. 에러메시지를 출력하는 메소드
        //    (조건) 에러코드를 전달받아 각각의 요청에 대해 에러를 알리는 메시지를 출력하세요.

    }

}
