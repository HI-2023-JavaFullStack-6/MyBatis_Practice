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

        if(selectedProductList != null && selectedProductList.size() > 0) {
            productPrint.printProductList(selectedProductList, searchCondition);
        } else {
            productPrint.printErrorMessage("selectOne");
        }
    }

    public void registNewProduct(ProductDTO product) {

        product.setReleaseDate(product.getReleaseDate().replaceAll("-",""));
        product.setProductionStatus("Y".toUpperCase());
        product.setSalesQuantity("0");

        if(productService.registNewProduct(product)) {
            productPrint.printSuccessMessage("insert");
        }else {
            productPrint.printErrorMessage("insert");
        }
    }

    public void modifyProductInfo(ProductDTO product) {

        product.setReleaseDate(product.getReleaseDate().replaceAll("-",""));

        if(productService.modifyProductInfo(product)) {
            productPrint.printSuccessMessage("update");
        }else {
            productPrint.printErrorMessage("update");
        }
    }

    public void deleteProduct(Map<String, String> parameter) {

        if(productService.deleteProduct(parameter)) {
            productPrint.printSuccessMessage("delete");
        } else {
            productPrint.printErrorMessage("delete");
        }
    }
}
