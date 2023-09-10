package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // 주석을 지우고 다음 네 가지 메소드를 작성하세요.

    public void printAllProductList(List<ProductDTO> allProductList) {
        System.out.println("====전체 제품 정보 목록====");
        for(ProductDTO product : allProductList){
            System.out.println(product);
        }
        System.out.println("========");

        // 1. 전체 조회한 목록 출력하는 메소드
        //    (조건) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.

    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {

        // 2. 조건에 따라 조회한 목록을 출력하는 메소드
        //    (조건 1) SearchCondition 객체로 검색 조건이 무엇인지 출력하세요.
        //    (조건 2) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.
        String searchOption = "";
        switch (searchCondition.getOption()){
            case "productName": searchOption = "제품명 검색 결과"; break;
            case "salesStore": searchOption = "판매점 검색 결과"; break;
            case "newProduct": searchOption = "이달의 신제품 회원"; break;
            case "nonProduction": searchOption = "생산 중단 제품"; break;
        }
        System.out.println("===="+searchOption+" 목록====");
        for(ProductDTO product : productList){
            System.out.println(product);
        }
        System.out.println("========");

    }

    public void printSuccessMessage(String successCode) {

        // 3. 성공메시지를 출력하는 메소드
        //    (조건) 성공코드를 전달받아 성공을 알리는 메시지를 출력하세요.
        String successMessage = "";
        switch (successCode){
            case "registProduct": successMessage = "신규 제품을 등록했습니다."; break;
            case "modifyProduct": successMessage = "제품 정보를 수정했습니다."; break;
            case "deleteProduct": successMessage = "제품 정보를 삭제했습니다."; break;
        }
        System.out.println(successMessage);
        System.out.println("========");

    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode){
            case "selecAlltList" : errorMessage = "전체 제품 정보 조회에 실패했습니다"; break;
            case "selectList" : errorMessage = "제품 정보 조회에 실패했습니다."; break;
            case "registProduct" : errorMessage = "신규 제품 등록에 실패했습니다."; break;
            case "modifyProduct" : errorMessage = "제품 정보 수정에 실패했습니다."; break;
            case "deleteProduct" : errorMessage = "제품 정보 삭제에 실패했습니다."; break;
        }
        System.out.println(errorMessage);
        System.out.println("========");
        // 4. 에러메시지를 출력하는 메소드
        //    (조건) 에러코드를 전달받아 에러를 알리는 메시지를 출력하세요.
    }

}
