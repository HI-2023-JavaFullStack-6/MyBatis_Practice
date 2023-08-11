package com.management.product.model.service;

import com.common.SearchCondition;
import com.management.product.model.dao.ProductDAO;
import com.management.product.model.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.Template.getSqlSession;

public class ProductService {

    private static ProductDAO productDAO;

    public static List<ProductDTO> selectAllProductList() {

        SqlSession sqlsession = getSqlSession();
        productDAO = sqlsession.getMapper(ProductDAO.class);
        List<ProductDTO> productList = productDAO.selectAllProductList();
        sqlsession.close();
        return productList;

    }

    public static List<ProductDTO> selectProductByCondition(SearchCondition searchCondition) {

        SqlSession sqlSession  = getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);
        List<ProductDTO> productList = productDAO.selectProductByCondition(searchCondition);
        sqlSession.close();
        return productList;

    }

    public boolean registNewProduct(ProductDTO product) {

        SqlSession sqlSession = getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);
        int result = productDAO.registNewProduct(product);
        if (result >0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        return result > 0 ? true : false;

    }

    public boolean modifyProductInfo(ProductDTO product) {

        SqlSession sqlSession = getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);
        int result = productDAO.modifyProductInfo(product);
        if(result >0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        return result > 0 ? true : false;

    }

    public boolean deleteProduct(Map<String, String> parameter) {

        SqlSession sqlSession = getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);
        int result = productDAO.deleteProduct(parameter);
        if (result > 0 ) {
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        return result > 0 ? true : false;

    }
}
