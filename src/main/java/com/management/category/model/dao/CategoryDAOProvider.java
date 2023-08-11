package com.management.category.model.dao;

import com.management.category.model.dto.CategoryDTO;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class CategoryDAOProvider {

    public String selectCategoryList(Map<String, String> parameter) {


        SQL sql = new SQL();
                   sql.SELECT("A.CATEGORY_NAME")
                        .SELECT("A.CATEGORY_CODE")
                             .FROM("PRODUCT_CATEGORY A");
                       if(parameter.get("option") == "orderList") {
                    sql.SELECT("COUNT(A.CATEGORY_CODE)")
                            .INNER_JOIN("PRODUCT_INFO B ON (A.CATEGORY_CODE = B.CATEGORY_CODE)")
                            .WHERE("A.CATEGORY_CODE > 0")
                            .GROUP_BY("A.CATEGORY_CODE")
                            .ORDER_BY("COUNT(A.CATEGORY_CODE) DESC");
                }

        return sql.toString();

    }

    public String insertCategory(CategoryDTO category) {

        return new SQL()
                .INSERT_INTO("PRODUCT_CATEGORY")
                .VALUES("CATEGORY_NAME", "#{categoryName}").toString();

    }

    public String updateCategory(CategoryDTO category) {

        return new SQL()
                .UPDATE("PRODUCT_CATEGORY")
                .SET("CATEGORY_NAME = #{categoryName}")
                .WHERE("CATEGORY_CODE = #{categoryCode}").toString();

    }

    public String deleteCategory(Map<String, String> parameter) {

        SQL sql = new SQL();
        sql.DELETE_FROM("PRODUCT_CATEGORY")
                .WHERE("CATEGORY_CODE = #{categoryCode}");
        return sql.toString();

    }
}
