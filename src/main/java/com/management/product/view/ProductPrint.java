package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {

    public void printAllProductList(List<ProductDTO> allProductList) {

        for(ProductDTO product : allProductList) {
            System.out.println(product);
        }
    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {

        String searchOption = searchCondition.getSearchOption();
        String searchValue= searchCondition.getSearchValue();

        System.out.println("검색 조건 : " + searchOption);
        System.out.println("검색 값 : " + searchValue);

        for(ProductDTO product : productList) {
            System.out.println(product);
        }
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";

        switch (successCode) {
            case "" : successMessage = ""; break;
        }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";

        switch (errorCode) {
            case "selectList" : errorMessage = "메뉴 목록 조회에 실패하였습니다"; break;
        }
        System.out.println(errorMessage);
    }
}