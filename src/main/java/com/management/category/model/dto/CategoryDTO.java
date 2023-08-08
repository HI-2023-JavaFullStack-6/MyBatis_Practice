package com.management.category.model.dto;

import java.io.Serializable;

public class CategoryDTO implements Serializable {
    private String categoryCode;
    private String categoryName;

    public CategoryDTO() {
        super();
    }

    public CategoryDTO(String categoryCode, String categoryName) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
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

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryCode='" + categoryCode + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }


}
