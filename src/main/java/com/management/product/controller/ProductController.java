package com.management.product.controller;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;
import com.management.product.model.service.ProductService;
import com.management.product.view.ProductPrint;

import java.util.List;
import java.util.Map;

public class ProductController {
    private final ProductService productService;
    private final ProductPrint productPrint;
    public ProductController() {
        productService = new ProductService();
        productPrint = new ProductPrint();
    }
    public void selectAllProductList() {

        List<ProductDTO> allProductList = productService.selectAllProductList();

        if(allProductList != null && allProductList.size() > 0) {
            productPrint.printAllProductList(allProductList);
        } else {
            productPrint.printErrorMessage("selectList");
        }
    }

    public void selectProductByCondition(SearchCondition searchCondition) {

        List<ProductDTO> productList = productService.selectProductByCondition(searchCondition);

        if(productList != null && productList.size() > 0) {
            productPrint.printProductList(productList, searchCondition);
        } else {
            productPrint.printErrorMessage("selectList");
        }
    }

    public void registNewProduct(ProductDTO product) {

        String replaceDate = product.getReleaseDate();
        replaceDate = replaceDate.replaceAll("[^0-9]", "");

        product.setReleaseDate(replaceDate);
        product.setProductionStatus("Y");
        product.setSalesQuantity("0");

        boolean result = productService.registNewProduct(product);

        if (result) {
            System.out.println("제품 등록 성공");
        } else {
            System.out.println("제품 등록 실패");
        }
    }

    public void modifyProductInfo(ProductDTO product) {

        String replaceDate = product.getReleaseDate();
        replaceDate = replaceDate.replaceAll("[^0-9]", "");

        product.setReleaseDate(replaceDate);

        boolean result = productService.modifyProductInfo(product);

        if (result) {
            System.out.println("제품 수정 성공");
        } else {
            System.out.println("제품 수정 실패");
        }
    }

    public void deleteProduct(Map<String, String> parameter) {

        boolean result = productService.deleteProduct(parameter);

        if (result) {
            System.out.println("제품 삭제 성공");
        } else {
            System.out.println("제품 삭제 실패");
        }


    }
}
