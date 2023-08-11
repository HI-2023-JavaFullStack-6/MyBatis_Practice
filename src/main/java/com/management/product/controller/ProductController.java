package com.management.product.controller;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;
import com.management.product.model.service.ProductService;
import com.management.product.view.ProductPrint;

import java.util.List;
import java.util.Map;

public class ProductController {
    private  final ProductService productService;
    private final ProductPrint productPrint;



    public ProductController() {
        productService = new ProductService();
        productPrint = new ProductPrint();

    }

    public void selectAllProductList() {
        List<ProductDTO> productlist = productService.selectAllProductList();
        if(productlist != null){
            productPrint.printAllProductList(productlist);
        }else {
            productPrint.printErrorMessage("selectAll");
        }

    }

    public void selectProductByCondition(SearchCondition searchCondition) {
        List<ProductDTO> productlist = productService.selectProductByCondition(searchCondition);
        if(productlist != null && productlist.size() > 0){
            productPrint.printProductList(productlist, searchCondition);
        }else {
            productPrint.printErrorMessage("select");

        }
        
    }

    public void registNewProduct(ProductDTO product) {

        if(productService.registNewProduct(product)) {
            productPrint.printSuccessMessage("insert");
        } else {
            productPrint.printErrorMessage("insert");
        }





    }

    public void modifyProductInfo(ProductDTO product) {


        if(productService.modifyProductInfo(product)){
            productPrint.printSuccessMessage("modify");
        }else {
            productPrint.printErrorMessage("modify");
        }

    }

    public void deleteProduct(Map<String, String> parameter) {

        if(productService.deleteProduct(parameter)){
            productPrint.printSuccessMessage("delete");
        }else {
            productPrint.printErrorMessage("delete");
        }

    }
}
