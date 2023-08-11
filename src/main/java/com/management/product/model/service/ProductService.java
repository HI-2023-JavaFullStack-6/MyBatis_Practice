package com.management.product.model.service;

import com.common.SearchCondition;
import com.management.product.model.dao.ProductDAO;
import com.management.product.model.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;
import static com.common.Template.getSqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {

    private ProductDAO mapper;


    public List<ProductDTO> selectAllProductList() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);
        List<ProductDTO> productList = mapper.selectAllProductList();

        sqlSession.close();
        return productList;

    }

    public List<ProductDTO> selectProductByCondition(SearchCondition searchCondition) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        List<ProductDTO> productList = mapper.selectProductByCondition(searchCondition);

        Map<String, SearchCondition> map = new HashMap<>();
        map.put("productName", searchCondition);

        sqlSession.close();
        return productList;
    }

    public boolean registNewProduct(ProductDTO product) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        int result = mapper.insertProduct(product);
        sqlSession.close();
        return result > 0 ? true : false;

    }

    public boolean modifyProductInfo(ProductDTO product) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        int result = mapper.updateProduct(product);

        sqlSession.close();
        return result > 0 ? true : false;

    }

    public boolean deleteProduct(Map<String, String> parameter) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        String productCode = parameter.get("productCode");

        int result = mapper.deleteProduct(parameter);

        sqlSession.close();
        return result > 0 ? true : false;
    }
}
