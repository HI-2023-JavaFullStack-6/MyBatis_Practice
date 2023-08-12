package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {

    public void printAllProductList(List<ProductDTO> allProductList) {
        System.out.println("=========== 전체 제품 정보 조회 결과 ===========");
        for (ProductDTO productDTO : allProductList) {
            System.out.println(productDTO);
        }
    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {

        String searchOption = searchCondition.getSearchOption();

        if(searchOption == "productName") {
            System.out.println("=========== 입력한 제품 조회 결과 ===========");
        } else if (searchOption == "salesStore") {
            System.out.println("=========== 입력한 판매점 취급 제품 조회 결과 ===========");
        } else if (searchOption == "newProduct") {
            System.out.println("=========== 이달의 신 제품 조회 결과 ===========");
        } else {
            System.out.println("=========== 생산 중단 제품 조회 결과 ===========");
        }

        for (ProductDTO productDTO : productList) {
            System.out.println(productDTO);
        }

    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";

        switch (successCode) {
            case "insert" : successMessage = "제품 정보 등록에 성공하였습니다."; break;
            case "update" : successMessage = "제품 정보 수정에 성공하였습니다."; break;
            case "delete" : successMessage = "제품 정보 삭제에 성공하였습니다."; break;
        }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";

        switch (errorCode) {
            case "selectList" : errorMessage = "제품 정보 조회 결과가 없습니다."; break;
            case "selectCondition" : errorMessage = "입력하신 조건에 해당하는 제품 정보 조회 결과가 없습니다."; break;
            case "insert" : errorMessage = "제품 정보 등록에 실패하였습니다."; break;
            case "update" : errorMessage = "제품 정보 수정에 실패하였습니다."; break;
            case "delete" : errorMessage = "제품 정보 삭제에 실패하였습니다."; break;
        }
        System.out.println(errorMessage);
    }

}
