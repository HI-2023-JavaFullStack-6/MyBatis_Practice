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

    public ProductController(){
        productService = new ProductService();
        productPrint = new ProductPrint();
    }


    public void selectAllProductList() {

        List<ProductDTO> productList = productService.selectAllProductList();

        if(productList != null){
           productPrint.printAllProductList(productList);
        }else{
            productPrint.printErrorMessage("selectAllProductList");
        }

    }

    public void selectProductByCondition(SearchCondition searchCondition) {

        List<ProductDTO> productList = productService.selectProductByCondition(searchCondition);


        if(productList != null){
            productPrint.printProductList(productList,searchCondition);
        }else {
            productPrint.printErrorMessage("selectProductByCondition");
        }

    }

    public void registNewProduct(ProductDTO product) {

        String name = product.getName();
        String categoryCode = product.getCategoryCode();
        String originCost = product.getOriginCost();
        String releaseDate = product.getReleaseDate().replace("-","");
        String stockQuantity = product.getStockQuantity();
        String discountRate = product.getDiscountRate();
        String productionStatus = "Y";
        String salesQuantity = "0";

        ProductDTO productList = new ProductDTO();
        productList.setName(name);
        productList.setCategoryCode(categoryCode);
        productList.setOriginCost(originCost);
        productList.setReleaseDate(releaseDate);
        productList.setStockQuantity(stockQuantity);
        productList.setDiscountRate(discountRate);
        productList.setProductionStatus(productionStatus);
        productList.setSalesQuantity(salesQuantity);

        if(productService.registNewProduct(productList)){
            productPrint.printSuccessMessage("registNewProduct");
        }else{
            productPrint.printErrorMessage("registNewProduct");
        }
    }

    public void modifyProductInfo(ProductDTO product) {

        int code = product.getCode();
        String name = product.getName().toUpperCase();
        String categoryCode = product.getCategoryCode();
        String originCost = product.getOriginCost();
        String releaseDate = product.getReleaseDate().replace("-","");
        String stockQuantity = product.getStockQuantity();
        String discountRate = product.getDiscountRate();
        String productionStatus = product.getProductionStatus();
        String salesQuantity = product.getSalesQuantity();

        ProductDTO productList = new ProductDTO();
        productList.setCode(code);
        productList.setName(name);
        productList.setCategoryCode(categoryCode);
        productList.setOriginCost(originCost);
        productList.setReleaseDate(releaseDate);
        productList.setStockQuantity(stockQuantity);
        productList.setDiscountRate(discountRate);
        productList.setProductionStatus(productionStatus);
        productList.setSalesQuantity(salesQuantity);

        if(productService.modifyProductInfo(productList)){
            productPrint.printSuccessMessage("modifyProductInfo");
        }else{
            productPrint.printErrorMessage("modifyProductInfo");
        }
    }

    public void deleteProduct(Map<String, String> parameter) {

        if(productService.deleteProduct(parameter)){
            productPrint.printSuccessMessage("deleteProduct");
        }else {
            productPrint.printErrorMessage("deleteProduct");
        }

    }
}
