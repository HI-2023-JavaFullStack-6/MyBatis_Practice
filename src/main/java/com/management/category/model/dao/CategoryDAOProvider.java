package com.management.category.model.dao;


import com.management.category.model.dto.CategoryDTO;
import org.apache.ibatis.jdbc.SQL;
import com.common.SearchCondition;

import java.util.Map;

public class CategoryDAOProvider {

    // * 주석을 지우고 Provider 활용하여 내용을 작성하세요.

    public String selectCategoryList(Map<String, String> parameter) {

        SQL sql = new SQL();
            sql.SELECT("CATEGORY_CODE")
               .SELECT("CATEGORY_NAME");
        sql.FROM("PRODUCT_CATEGORY");
        /*if ("orderList".equals(parameter.get("option"))) {
            sql
            .JOIN("PRODUCT_INFO B ON (A.CATEGORY_CODE = B.CATEGORY_CODE)")
                    .GROUP_BY("B.CATEGORY_CODE")
                    .ORDER_BY("COUNT(A.CATEGORY_CODE) DESC");
        }*/


    return sql.toString();

    }

    public String insertCategory(CategoryDTO category) {
        SQL sql = new SQL();
        sql.INSERT_INTO("PRODUCT_CATEGORY")
                .VALUES("CATEGORY_NAME", "#{categoryName}");
        return sql.toString();

    }

    public String updateCategory(CategoryDTO category) {
        return new SQL()
                .UPDATE("PRODUCT_CATEGORY")
                .SET("CATEGORY_NAME = #{categoryName}")
                .WHERE("CATEGORY_CODE = #{categoryCode}")
                .toString();
    }

    public String deleteCategory(Map<String, String> parameter) {

        return new SQL()
                .DELETE_FROM("PRODUCT_CATEGORY")
                .WHERE("CATEGORY_CODE = #{categoryCode}")
                .toString();


    }
}
