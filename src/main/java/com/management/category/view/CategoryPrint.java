package com.management.category.view;

import com.management.category.model.dto.CategoryDTO;

import java.util.List;

public class CategoryPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // * 주석을 지우고 다음 세 가지 메소드를 작성하세요.

    public void printTeamList(List<CategoryDTO> catList) {
        if(catList != null) {
            for (CategoryDTO category : catList) {
                System.out.println(category);
            }
        }
        // 1. 조회한 목록 출력하는 메소드
        //    (조건 1) HashMap 타입의 매개변수로 받아온 값을 기준으로 전체 목록 조회인지, 순위별 제품분류 조회인지 구분하여 출력하세요.
        //    (조건 2) List<CategoryDTO>로 받아온 데이터 목록을 전체 출력하세요.

    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch(successCode) {
            case "insert" : successMessage = "신규 제품 분류 생성에 완료하였습니다."; break;
            case "update" : successMessage = "기존 제품 수정에 완료하였습니다";break;
        }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage =  errorCode;

            switch(errorMessage) {
                case "selectAllList" : errorMessage = "전체 제품 분류 조회에 실패하였습니다."; break;
                case "selectList" : errorMessage = "조건에 맞는 제품 분류 조회에 실패하였습니다."; break;
                case "insert" : errorMessage = "신규 제품 분류 생성에 실패하였습니다."; break;
                case "update" : errorMessage = "기존 제품 수정에 실패하였습니다";break;
            }
        // 3. 에러메시지를 출력하는 메소드
        //    (조건) 에러코드를 전달받아 각각의 요청에 대해 에러를 알리는 메시지를 출력하세요.

    }

}
