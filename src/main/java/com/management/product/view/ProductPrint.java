package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // 주석을 지우고 다음 네 가지 메소드를 작성하세요.

    public void printAllProductList(List<ProductDTO> allProductList) {

        for(ProductDTO pro : allProductList) {
            System.out.println(pro);
        }

    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {

        String searchOption = "";
        switch (searchCondition.getOption()) {
            case "productName" : searchOption = "1. 제품명 조회 결과\n"; break;
            case "salesStore" : searchOption = "2. 판매처 조회 결과\n"; break;
            case "newProduct" : searchOption = "3. 신상품 기준 조회 결과\n"; break;
            case "nonProduction" : searchOption = "4. 생산 중단 제품 조회 결과\n"; break;

        }
        for(ProductDTO pro : productList) {
            System.out.println(pro);
        }

    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch (successCode) {
            case "insert" : successMessage = "신규 제품 등록 성공"; break;
            case "update" : successMessage = "제품 정보 수정 성공"; break;
            case "delete" : successMessage = "제품 정보 삭제 성공"; break;
        }
        System.out.println(successMessage);

    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "selectList" : errorMessage = "제품 전체 목록 조회 실패"; break;
            case "selectOne" : errorMessage = "제품 검색 실패"; break;
            case "insert" : errorMessage = "신규 제품 등록 실패"; break;
            case "update" : errorMessage = "제품 정보 수정 실패"; break;
            case "delete" : errorMessage = "제품 정보 삭제 실패"; break;
        }
        System.out.println(errorMessage);
    }

}
