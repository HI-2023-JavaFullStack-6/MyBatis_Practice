package com.management.product.controller;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;
import com.management.product.model.service.ProductService;
import com.management.product.view.ProductPrint;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductController {

    private final ProductService productService;
    private final ProductPrint productPrint;

    public ProductController() {
        productService = new ProductService();
        productPrint = new ProductPrint();
    }

    Scanner sc = new Scanner(System.in);
    public void selectAllProductList() {

        List<ProductDTO> productList = productService.selectAllProductList();

        if(productList != null && productList.size() > 0) {
            productPrint.printAllProductList(productList);
        } else {
            productPrint.printErrorMessage("selectList");
        }

    }

    public void selectProductByCondition(SearchCondition searchCondition) {

        List<ProductDTO> selectedProductList = productService.selectProductByCondition(searchCondition);

        if(selectedProductList == null && selectedProductList.size() > 0) {
            productPrint.printProductList(selectedProductList, searchCondition);
        } else {
            productPrint.printErrorMessage("selectOne");
        }

    }

    public void registNewProduct(ProductDTO product) {




        if(productService.registNewProduct(product)) {
            productPrint.printSuccessMessage("insert");
        }else {
            productPrint.printErrorMessage("insert");
        }
        // 4. 제품 정보를 등록하는 메소드
        //    (조건 1) 화면에서 releaseDate를 0000-00-00 형태로 받아옵니다.
        //            해당 필드에 매핑되는 DB 컬럼 releaseDate가 8byte이므로 '-' 문자를 제거하여 product객체에 setting 하세요.
        //            또한 제품 최초 등록 시 생산여부는 무조건 '생산중(Y)'이고, 판매량은 0이므로 해당 값을 product객체에 setting 하세요.
        //　  (조건 2) Service 객체를 호출하여 등록을 수행하고, 결과를 boolean 값으로 return 받으세요.
        //    (조건 3) insert가 정상적으로 수행된 경우, Print 객체를 통해 등록 성공했다는 성공 메세지를 출력하세요.
        //    (조건 4) insert가 정상적으로 수행되지 않은 경우, Print 객체를 통해 등록 실패했다는 오류 메세지를 출력하세요.
    }

    public void modifyProductInfo(ProductDTO product) {

        if(productService.modifyProductInfo(product)) {
            productPrint.printSuccessMessage("update");
        }else {
            productPrint.printErrorMessage("update");
        }

        // 4. 제품 정보를 등록하는 메소드
        //    (조건 1) 화면에서 releaseDate를 0000-00-00 형태로 받아옵니다.
        //            해당 필드에 매핑되는 DB 컬럼 releaseDate가 8byte이므로 '-' 문자를 제거하여 product객체에 setting 하세요.
        //            또한 제품 최초 등록 시 생산여부는 무조건 '생산중(Y)'이고, 판매량은 0이므로 해당 값을 product객체에 setting 하세요.
        //　  (조건 2) Service 객체를 호출하여 등록을 수행하고, 결과를 boolean 값으로 return 받으세요.
        //    (조건 3) insert가 정상적으로 수행된 경우, Print 객체를 통해 등록 성공했다는 성공 메세지를 출력하세요.
        //    (조건 4) insert가 정상적으로 수행되지 않은 경우, Print 객체를 통해 등록 실패했다는 오류 메세지를 출력하세요.
    }

    public void deleteProduct(Map<String, String> parameter) {

        if(productService.deleteProduct(parameter)) {
            productPrint.printSuccessMessage("delete");
        } else {
            productPrint.printErrorMessage("delete");
        }


    }
}
