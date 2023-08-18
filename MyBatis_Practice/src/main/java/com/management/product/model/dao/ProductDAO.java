package com.management.product.model.dao;

import com.common.SearchCondition;
import com.management.product.model.dto.ProductDTO;

import java.util.List;
import java.util.Map;

public interface ProductDAO {
    List<ProductDTO> selectProductByCondition(SearchCondition searchCondition);

    List<ProductDTO> selectAllProductList();

    int registNewProduct(ProductDTO product);

    int modifyProductInfo(ProductDTO product);

    int deleteProduct(Map<String, String> parameter);



}
