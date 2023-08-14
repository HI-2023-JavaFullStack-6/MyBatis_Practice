package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {

    public void printAllProductList(List<ProductDTO> proList) {
        for (ProductDTO product : proList) {
            System.out.println(product);
        }
        // 1. 전체 조회한 목록 출력하는 메소드
        //    (조건) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.

    }

    public void printProductList(List<ProductDTO> proList) {
        if(proList != null && proList.size() > 0) {
            for (ProductDTO product : proList) {
                System.out.println(product);
            }
        }
        // 2. 조건에 따라 조회한 목록을 출력하는 메소드
        //    (조건 1) SearchCondition 객체로 검색 조건이 무엇인지 출력하세요.
        //    (조건 2) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch (successCode) {
            case "selectList" : successMessage = "전체 제품 조회에 완료하였습니다."; break;
            case "selectByCondition" : successMessage = "기존 제품 조회에 완료하였습니다."; break;
            case "insert" : successMessage = "신규 제품 등록에 완료하였습니다."; break;
            case "update" : successMessage = "기존 제품 수정에 완료하였습니다."; break;
            case "delete" : successMessage = "기존 제품 삭제에 완료하였습니다."; break;
        }
        System.out.println(successMessage);
    }
    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "selectList" : errorMessage = "제품 전체 조회에 실패하였습니다."; break;
            case "selectByCondition" : errorMessage = "제품 조회에 실패하였습니다."; break;
            case "insert" : errorMessage = "신규 제품 등록에 실패하였습니다."; break;
            case "update" : errorMessage = "기존 제품 수정에 실패하였습니다."; break;
            case "delete" : errorMessage = "기존 제품 삭제에 실패하였습니다."; break;
        }
        System.out.println(errorMessage);
    }

}


