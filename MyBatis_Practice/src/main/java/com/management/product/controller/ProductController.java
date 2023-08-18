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
        productPrint = new ProductPrint();
        productService = new ProductService();
    }

    public void selectAllProductList() {

        List<ProductDTO> productList = productService.selectAllProductList();

        if (productList != null) {
            productPrint.printAllProductList(productList);
        }else {
            productPrint.printErrorMessage("selectList");
        }
    }


    public void selectProductByCondition(SearchCondition searchCondition) {

        List<ProductDTO> productList = productService.selectProductByCondition(searchCondition);

        if (productList != null && productList.size() > 0 ){
            productPrint.printProductList(productList, searchCondition);
        }else {
            productPrint.printErrorMessage("select");
        }
    }

    public void registNewProduct(ProductDTO product) {

                if (productService.registNewProduct(product)) {
                    productPrint.printSuccessMessage("insert");
                }else {
                    productPrint.printErrorMessage("insert");
                }
        }

    public void modifyProductInfo(ProductDTO product) {

        if (productService.modifyProductInfo(product)) {
            productPrint.printSuccessMessage("update");
        }else {
            productPrint.printErrorMessage("update");
        }
    }

    public void deleteProduct(Map<String, String> parameter) {

            if (productService.deleteProduct(parameter)) {
                productPrint.printSuccessMessage("delete");
            }else {
                productPrint.printErrorMessage("delete");
            }
    }
}
