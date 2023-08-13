package com.management.category.model.dao;

import com.management.category.model.dto.CategoryDTO;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class CategoryDAOProvider {

    public String selectCategoryList(Map<String, String> parameter) {
        SQL sql = new SQL();

        sql.SELECT("CATEGORY_CODE")
                .SELECT("CATEGORY_NAME")
                .SELECT("COUNT(PRODUCT_CODE)");

        sql.FROM("PRODUCT_CATEGORY");
        sql.JOIN("PRODUCT_INFO USING (CATEGORY_CODE)");
        sql.GROUP_BY("CATEGORY_CODE");
        if (parameter.get("option").equals("orderList")) {
            sql.ORDER_BY("COUNT(CATEGORY_CODE) DESC");
        }

        return sql.toString();
    }

    public String insertCategory(CategoryDTO category) {
        SQL sql = new SQL();

        sql.
                INSERT_INTO("PRODUCT_CATEGORY").
                VALUES("CATEGORY_NAME", "#{ categoryName }");

        return sql.toString();
    }

    public String updateCategory(CategoryDTO category) {
        SQL sql = new SQL();

        sql.
                UPDATE("PRODUCT_CATEGORY").
                SET("CATEGORY_NAME = #{ categoryName }").
                WHERE("CATEGORY_CODE = #{ categoryCode }");

        return sql.toString();
    }

    public String deleteCategory(Map<String, String> parameter) {
        SQL sql = new SQL();

        sql.
                DELETE_FROM("PRODUCT_CATEGORY").
                WHERE("CATEGORY_CODE = #{ categoryCode }");

        return sql.toString();

    }
}
