package com.management.product.controller;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;
import com.management.product.model.service.ProductService;
import com.management.product.view.ProductMenu;
import com.management.product.view.ProductPrint;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductController {


    private final ProductService productService;

    private final ProductPrint productPrint;

    public ProductController(){
        productService = new ProductService();
        productPrint = new ProductPrint();
    }
    public void selectAllProductList() {



        List<ProductDTO> allProductList = productService.selectAllProductList();

        if(allProductList != null) {
            productPrint.printAllProductList(allProductList);
        }else{
            productPrint.printErrorMessage("selectAllList");
        }
    }

    public void selectProductByCondition(SearchCondition searchCondition) {



        List<ProductDTO> menuList = productService.selectProductByCondition(searchCondition);

        if(menuList != null) {
            productPrint.printProductList(menuList);
        }else{
            productPrint.printErrorMessage("selectProductByCondition");
        }

    }

    public void registNewProduct(ProductDTO product) {



        product.getProductName();
        product.getCategoryCode();
        product.getOriginCost();
        product.getReleaseDate().replaceAll("-","");
        product.getSalesQuantity();
        product.getDiscountRate();
        product.setProductionStatus("Y");
        product.setSalesQuantity("0");


        boolean result = productService.registNewProduct(product);

        if(result == true){
            productPrint.printSuccessMessage("insert");
        }else{
            productPrint.printErrorMessage("insert");
        }
    }

    public void modifyProductInfo(ProductDTO product) {



        product.setReleaseDate(product.getReleaseDate().replaceAll("-", ""));

        boolean result = productService.modifyProductInfo(product);

        if(result == true){
            productPrint.printSuccessMessage("update");
        }else{
            productPrint.printErrorMessage("update");
        }

    }

    public void deleteProduct(Map<String, String> parameter) {

        boolean result = productService.deleteProduct(parameter);

        if( result == true) {
            productPrint.printSuccessMessage("delete");
        }else{
            productPrint.printErrorMessage("delete");
        }

    }
}
