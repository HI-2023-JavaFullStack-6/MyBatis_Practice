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

        List<ProductDTO> selectedProductList = mapper.selectProductByCondition(searchCondition);

        /*Map<String, SearchCondition> map = new HashMap<>();
        map.put("productName", searchCondition);
        map.put("salesStore", searchCondition);
        map.put("nonProduct", searchCondition);
        map.put("nonProduction", searchCondition);*/

        sqlSession.close();
        return selectedProductList;
    }

    public boolean registNewProduct(ProductDTO product) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        int result = mapper.insertProduct(product);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0 ? true : false;

    }

    public boolean modifyProductInfo(ProductDTO product) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        int result = mapper.updateProduct(product);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0 ? true : false;

    }

    public boolean deleteProduct(Map<String, String> parameter) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        String productCode = parameter.get("productCode");

        int result = mapper.deleteProduct(parameter);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }


        sqlSession.close();
        return result > 0 ? true : false;
    }
}
