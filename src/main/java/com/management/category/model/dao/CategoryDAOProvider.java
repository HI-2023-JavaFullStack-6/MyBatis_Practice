package com.management.category.model.dao;

import com.management.category.model.dto.CategoryDTO;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class CategoryDAOProvider {

    public String selectCategoryList(Map<String, String> parameter) {

        SQL sql = new SQL();

        if ("allList".equals(parameter.get("option"))){
            sql.SELECT("CATEGORY_CODE\n" +
                    "CATEGORY_NAME\n");
            sql.FROM("PRODUCT_CATEGORY");
        }else if ("orderList".equals(parameter.get("option"))){
            sql.SELECT("A.CATEGORY_CODE\n" +
                                 ",A.CATEGORY_NAME\n" +
                                 ",COUNT(B.PRODUCT_CODE) AS PRODUCTS_BY_CATEGORY\n");
              sql.FROM("PRODUCT_CATEGORY A");
              sql.JOIN("PRODUCT_INFO B ON (A.CATEGORY_CODE = B.CATEGORY_CODE)");
            sql.GROUP_BY("B.CATEGORY_CODE");
            sql.ORDER_BY("PRODUCTS_BY_CATEGORY DESC");
        }



        return sql.toString();

    }

    public String insertCategory(CategoryDTO category) {

        SQL sql = new SQL();

        sql.INSERT_INTO("PRODUCT_CATEGORY")
                .VALUES("CATEGORY_NAME", "#{ categoryName }");


        return sql.toString();
    }

    public String updateCategory(CategoryDTO category) {

        return new SQL()
                .UPDATE("PRODUCT_CATEGORY")
                .SET("CATEGORY_NAME = #{ categoryName }")
                .WHERE("CATEGORY_CODE = #{categoryCode}").toString();
    }

    public String deleteCategory(Map<String, String> parameter) {

        return new SQL()
                .DELETE_FROM("PRODUCT_CATEGORY")
                .WHERE("CATEGORY_CODE = #{ categoryCode }").toString();
    }
}
