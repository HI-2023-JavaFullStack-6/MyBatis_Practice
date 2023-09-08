package com.management.category.model.service;

import com.management.category.model.dao.CategoryDAO;
import com.management.category.model.dto.CategoryDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.common.Template.getSqlSession;

public class CategoryService {

private CategoryDAO categoryDAO;



    /*서비스에 입장권 있어야지~ 입장권 내용을 서비스에 적ㅇ어!!*/
    public List<CategoryDTO> selectCategoryList(Map<String, String> parameter) {


        SqlSession sqlSession = getSqlSession();
        categoryDAO = sqlSession.getMapper(CategoryDAO.class);

        List<CategoryDTO> teamList = categoryDAO.selectCategoryList(parameter);

        sqlSession.close(); /*더이상 세션 필요 없어. 디비다녀왔어. 그러니까 반납.*/

        return teamList;
        // 2. 제품분류 목록을 조회하는 로직을 작성하세요.



    }

    public boolean registNewCategory(CategoryDTO category) {


        SqlSession sqlSession = getSqlSession();
        categoryDAO = sqlSession.getMapper(CategoryDAO.class);

        int result = categoryDAO.insertCategory(category);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        return result > 0 ? true : false;
        // 3. 제품분류 정보를 등록하는 로직을 작성하세요.

    }

    public boolean modifyCategoryName(CategoryDTO category) {

            SqlSession sqlSession = getSqlSession();
            categoryDAO = sqlSession.getMapper(CategoryDAO.class);

            int result = categoryDAO.updateCategory(category);

            if(result > 0) {
                sqlSession.commit();
               } else {
                sqlSession.rollback();
            }

            sqlSession.close();

            return result>0 ? true : false;
        // 4. 제품분류명을 수정하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.

    }

    public boolean deleteCategory(Map<String, String> parameter) {

        SqlSession sqlSession = getSqlSession();
        categoryDAO = sqlSession.getMapper(CategoryDAO.class);

        int result = categoryDAO.deleteCategory(parameter);

        if(result > 0) {
            sqlSession.commit();
          } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }
}

// 5. 제품분류 정보를 삭제하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.

