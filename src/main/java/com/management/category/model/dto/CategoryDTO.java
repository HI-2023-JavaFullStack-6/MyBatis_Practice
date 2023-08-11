package com.management.category.model.dto;

import com.management.product.model.dto.ProductDTO;

public class CategoryDTO implements java.io.Serializable{


    private String categoryCode;
    private String categoryName;


    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryCode='" + categoryCode + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryDTO(String categoryCode, String categoryName) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
    }

    public CategoryDTO() {
    }
}
