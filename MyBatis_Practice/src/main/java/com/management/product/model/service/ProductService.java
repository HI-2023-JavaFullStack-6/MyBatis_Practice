package com.management.product.model.service;

import com.common.SearchCondition;
import com.management.product.model.dao.ProductDAO;
import com.management.product.model.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.Template.getSqlSession;

public class ProductService {


    private ProductDAO mapper;
    public List<ProductDTO> selectAllProductList() {

        SqlSession sqlSession = getSqlSession();
        ProductDAO allSelectList = sqlSession.getMapper(ProductDAO.class);

        List<ProductDTO> productList = allSelectList.selectAllProductList();

        sqlSession.close();

        return productList;

    }

    public List<ProductDTO> selectProductByCondition(SearchCondition searchCondition) {


        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        List<ProductDTO> product = mapper.selectProductByCondition(searchCondition);

        sqlSession.close();

        return product;

    }
    public boolean registNewProduct(ProductDTO product) {


        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        int result = mapper.registNewProduct(product);

        if (result > 0) {
            registNewProduct(product);
            sqlSession.commit();
        } else {
            registNewProduct(product);
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0? true : false;
    }

    public boolean modifyProductInfo(ProductDTO product) {


        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        int result = mapper.modifyProductInfo(product);

        if (result > 0) {
            modifyProductInfo(product);
            sqlSession.commit();
        }else {
            modifyProductInfo(product);
            sqlSession.rollback();
        }
        return result > 0? true : false;

    }

    public boolean deleteProduct(Map<String, String> parameter) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);
        int result = mapper.deleteProduct(parameter);

        if (result > 0 ) {
            sqlSession.commit();
            deleteProduct(parameter);
        }else {
            sqlSession.rollback();
            deleteProduct(parameter);
        }
        return result > 0? true : false;

    }
}
