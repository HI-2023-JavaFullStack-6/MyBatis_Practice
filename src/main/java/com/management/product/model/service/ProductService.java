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
    // 1. 자주 사용할 DAO 객체를 선언s하세요.

    public List<ProductDTO> selectAllProductList() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        List<ProductDTO> proList = mapper.selectAllProductList();

        sqlSession.close();
        return proList;
    }

    public List<ProductDTO> selectProductByCondition(SearchCondition condition) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        List<ProductDTO> proList = mapper.selectProductByCondition(condition);

        sqlSession.close();
        return proList;

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
        return result > 0? true : false;

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
        return result > 0? true : false;
        // 5. 제품 정보를 수정하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.

    }

    public boolean deleteProduct(Map<String, String> parameter) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        int result = mapper.deleteProduct(parameter);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0? true : false;
        // 6. 제품 정보를 삭제하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.


    }
}
