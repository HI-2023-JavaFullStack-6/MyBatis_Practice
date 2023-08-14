package com.management.category.model.service;

import com.management.category.model.dao.CategoryDAO;
import com.management.category.model.dto.CategoryDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.Template.getSqlSession;

public class CategoryService {

    // * 주석을 지우고 Service 역할에 해당하는 메소드를 작성하세요.
    private CategoryDAO mapper;
    // 1. 자주 사용할 DAO 객체를 선언하세요.

    public List<CategoryDTO> selectCategoryList(Map<String, String> parameter) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(CategoryDAO.class);

        List<CategoryDTO> catList = mapper.selectCategoryList(parameter);

        sqlSession.close();
        return catList;
        // 2. 제품분류 목록을 조회하는 로직을 작성하세요.
        // 　　아래 작성된 return null은 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.


    }

    public boolean registNewCategory(CategoryDTO catDTO) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(CategoryDAO.class);

        int result = mapper.insertCategory(catDTO);

        if(result > 0) {
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
            sqlSession.close();
            return result > 0 ? true : false;
    }
    /*
         3. 제품분류 정보를 등록하는 로직을 작성하세요.
         　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        */


    public boolean modifyCategoryName(CategoryDTO catDTO) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(CategoryDAO.class);

        int result = mapper.updateCategory(catDTO);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0 ? true : false;
        // 4. 제품분류명을 수정하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.

    }

    public boolean deleteCategory(Map<String, String> parameter) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(CategoryDAO.class);

        int result = mapper.deleteCategory(parameter);

        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        return result > 0 ? true : false;
        // 5. 제품분류 정보를 삭제하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요

    }
}
