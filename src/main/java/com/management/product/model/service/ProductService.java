package com.management.product.model.service;

import com.common.SearchCondition;
import com.management.product.model.dao.ProductDAO;
import com.management.product.model.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;
import static com.common.Template.getSqlSession;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductService {

    private ProductDAO productDAO;


    public List<ProductDTO> selectAllProductList() {

        SqlSession sqlSession = getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);
        List<ProductDTO> productList = productDAO.selectAllProductList();

        if(productList != null && productList.size() > 0) {
            for(ProductDTO pro : productList) {
                System.out.println(pro);
            }
        } else {
            System.out.println("전체 조회 실패");
        }

        sqlSession.close();

        return productList;

    }

    public List<ProductDTO> selectProductByCondition(SearchCondition searchCondition) {

        SqlSession sqlSession = getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        List<ProductDTO> productList = productDAO.selectProductByCondition(searchCondition);

        Scanner sc = new Scanner(System.in);
        String condition = sc.nextLine();

        if (condition == "1") {

        }


        if(productList != null && productList.size() > 0) {
            for(ProductDTO pro : productList) {
                System.out.println(pro);
            }
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }

        sqlSession.close();
        return productList;

    }

    public boolean registNewProduct(ProductDTO product) {

        // 4. 제품 정보를 등록하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return false;

    }

    public boolean modifyProductInfo(ProductDTO product) {
        SqlSession sqlSession = getSqlSession();
        productDAO = sqlSession.getMapper(ProductDAO.class);

        int result = productDAO.modifyProductInfo(product);

        if(result > 0) {
            System.out.println("메뉴 정보 변경 성공");
            sqlSession.commit();
        } else {
            System.out.println("메뉴 정보 변경 실패");
            sqlSession.rollback();
        }
        sqlSession.close();
        return false;
    }

    public boolean deleteProduct(Map<String, String> parameter) {

        // 6. 제품 정보를 삭제하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return false;

    }
}
