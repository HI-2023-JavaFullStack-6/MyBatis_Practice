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

        System.out.println(searchCondition);
        for(ProductDTO product : productList){
            System.out.println(product);
        }


    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";

        switch(successCode){
            case "registNewProduct" : successMessage = "입력하신 메뉴 등록이 성공했습니다."; break;
            case "modifyProductInfo" : successMessage = "입력하신 메뉴 수정이 성공했습니다."; break;
            case "deleteProduct" : successMessage = "입력하신 메뉴 삭제가 성공했습니다."; break;
        }
        System.out.println(successMessage);

    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";


        switch(errorCode){
            case "selectAllProductList" : errorMessage = "전체 메뉴 조회를 실패했습니다."; break;
            case "selectProductByCondition" : errorMessage = "선택하신 메뉴 조회를 실패했습니다."; break;
            case "registNewProduct" : errorMessage = "입력하신 메뉴 등록이 실패했습니다."; break;
            case "modifyProductInfo" : errorMessage = "입력하신 메뉴 수정이 실패했습니다."; break;
            case  "deleteProduct" : errorMessage = "입력하신 메뉴 삭제가 실패했습니다."; break;
        }

        System.out.println(errorMessage);


    }

}
