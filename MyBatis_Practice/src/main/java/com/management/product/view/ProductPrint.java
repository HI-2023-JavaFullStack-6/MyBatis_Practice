package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;
import com.sun.source.tree.UsesTree;

import java.util.List;

public class ProductPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // 주석을 지우고 다음 네 가지 메소드를 작성하세요.

    public void printAllProductList(List<ProductDTO> allProductList) {

  for (ProductDTO select : allProductList) {
      System.out.println(select);
  }
    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {

        String searchOption = searchCondition.getSearchOption();

        switch (searchOption) {
            case "productName" :
                System.out.println("조회한 제품명 : " + searchCondition.getSearchValue()); break;
            case "salesStore" :
                System.out.println("조회한 판매점 유형 : " + searchCondition.getSearchValue());break;
            case "newProduct" :
                System.out.println("이달의 신제품 : ");break;
            case "nonProduction" :
                System.out.println("단종된 상품 결과 : ");break;
            default:
                System.out.println("검색어를 잘못 입력하였습니다/");
                return;
        }
        for(ProductDTO search : productList) {
            System.out.println(search);
        }

    }

    public void printSuccessMessage(String successCode) {


        String successMessage = "";

        switch (successCode) {
            case "inset" : successMessage = "신규 메뉴 등록에 성공하였습니다."; break;
            case "update" : successMessage = "메뉴 수정을 성공하였습니다."; break;
            case "delete" : successMessage = "메뉴 삭제를 성공하였습니다."; break;
        }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {
      String errorMessage ="";

      switch (errorCode) {
        case "select" : errorMessage = "메뉴 조회에 실패하였습니다." ; break;
        case "inset" : errorMessage = "메뉴 등록에 실패하였습니다." ; break;
        case "update" : errorMessage = "메뉴 수정을 실패하였습니다."; break;
          case "delete" : errorMessage = "메뉴 삭제를 실패하였습니다."; break;
      }
        System.out.println(errorMessage);
    }

}
