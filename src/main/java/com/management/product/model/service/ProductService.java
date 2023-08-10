package com.management.product.model.service;

import com.common.SearchCondition;
import com.management.product.model.dao.ProductDAO;
import com.management.product.model.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;
import static com.common.Template.getSqlSession;

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




        sqlSession.close();
        return productList;
    }

    public boolean registNewProduct(ProductDTO product) {
        /*SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        int result = mapper.registNewProduct(product);

        if(result > 0) {
            System.out.println("메뉴 정보 추가 성공");
            sqlSession.commit();
        } else {
            System.out.println("메뉴 정보 추가 실패");
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;*/
        return false;
    }

    public boolean modifyProductInfo(ProductDTO product) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductDAO.class);

        int result = mapper.modifyProductInfo(product);

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
