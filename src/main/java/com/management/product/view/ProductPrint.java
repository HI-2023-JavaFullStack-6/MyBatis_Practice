package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;
import com.management.product.model.service.ProductService;

import java.util.List;

public class ProductPrint {


    public void printAllProductList(List<ProductDTO> allProductList) {

        List<ProductDTO> productList = ProductService.selectAllProductList();
        for(ProductDTO product : productList){
            System.out.println(product);
        }
    }
    public void printProductList(List<ProductDTO> productList,SearchCondition searchCondition) {

        productList = ProductService.selectProductByCondition(searchCondition);
        for (ProductDTO product : productList) {
            System.out.println(product);
        }

    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode){
            case "insert" : successMessage = "추가 성공"; break;
            case "modify" : successMessage = "수정 성공"; break;
            case "delete" : successMessage = "삭제 성공"; break;

        }
        System.out.println(successMessage);

    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode){
          //  case "selectAll" : errorMessage = "전체메뉴 조회 실패"; break;
            case  "select" : errorMessage = "부분 조회 실패"; break;
            case  "insert" : errorMessage = "추가 실패"; break;
            case  "modify" : errorMessage = "수정 실패"; break;
            case  "delete" : errorMessage = "삭제 실패"; break;
        }
        System.out.println(errorMessage);

    }

}
