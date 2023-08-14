package com.management.category.model.dao;

import com.management.category.model.dto.CategoryDTO;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class CategoryDAOProvider {



    public String selectCategoryList(Map<String, String> parameter) {

        SQL sql = new SQL();


        sql.SELECT("A.CATEGORY_CODE")
                .SELECT("A.CATEGORY_NAME");

        if("orderList".equals(parameter.get("option"))){
            sql.SELECT("IFNULL(COUNT(B.PRODUCT_CODE), 0) AS CNT");
        }

        sql.FROM("PRODUCT_CATEGORY A");

        if("orderList".equals(parameter.get("option"))){
            sql.JOIN("PRODUCT_INFO B ON (A.CATEGORY_CODE = B.CATEGORY_CODE)")
                    .GROUP_BY("B.CATEGORY_CODE")
                    .ORDER_BY("CNT DESC");
        } else{
            sql.ORDER_BY("A.CATEGORY_CODE");
        }


        return sql.toString();
    }

    public String insertCategory(CategoryDTO category) {


        return new SQL()
                .INSERT_INTO("PRODUCT_CATEGORY")
                .VALUES("CATEGORY_NAME", "#{categoryName}").toString();

    }

    public String updateCategory(CategoryDTO category) {


        SQL sql = new SQL();

        sql.UPDATE("PRODUCT_CATEGORY")
                .SET("CATEGORY_NAME = #{ categoryName }")
                .WHERE("CATEGORY_CODE = #{ categoryCode }");

        return sql.toString();

    }

    public String deleteCategory(Map<String, String> parameter) {


        return new SQL()
                .DELETE_FROM("PRODUCT_CATEGORY")
                .WHERE("CATEGORY_CODE = #{ categoryCode }").toString();

    }
}
