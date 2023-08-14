package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {
    private SearchCondition searchCondition;


    public void printAllProductList(List<ProductDTO> allProductList) {



        for(ProductDTO menu : allProductList) {
            System.out.println(menu);
        }

    }

    public void printProductList(List<ProductDTO> productList) {



        for(ProductDTO menu: productList) {
            System.out.println(menu);
        }
    }

    public void printSuccessMessage(String successCode) {



        String successMessage = "";

        switch (successCode) {
            case "insert" : successMessage = "신규 메뉴 등록에 성공했습니다."; break;
            case "update" : successMessage = "메뉴 수정에 성공했습니다." ; break;
            case "delete" : successMessage = "메뉴 삭제에 성공했습니다." ;break;

        }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {



        String errorMessage = "";

        switch (errorCode){
            case "selectAllList" : errorMessage = "전체 메뉴 조회를 실패했습니다"; break;
            case "selectProductByCondition" : errorMessage = "검색한 조건으로 메뉴 조회를 실패했습니다"; break;
            case "insert" : errorMessage = "신규 메뉴 등록에 실패했습니다.";break;
            case "update" : errorMessage = "메뉴 수정에 실패했습니다";break;
            case "delete" : errorMessage = "메뉴 삭제에 실패했습니다."; break;
        }

        System.out.println(errorMessage);
    }

}
