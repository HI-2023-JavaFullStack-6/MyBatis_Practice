package com.management.category.model.dto;

public class CategoryDTO implements java.io.Serializable {

    // * 주석을 지우고 제품분류 정보를 담는 객체를 만들 java class를 작성하세요.
    // * 모든 필드는 String 타입으로 작성하시고, CategoryDTO는 productCompany DB의 'PRODUCT_CATEGORY' 테이블과 매핑 가능해야 합니다.
    // * DTO 객체에 대하여 기본적으로 작성해야 하는 사항 5가지 항목을 반드시 작성하세요.
private String categoryCode;
private String categoeyName;

    public CategoryDTO() {
    }

    public CategoryDTO(String categoryCode, String categoeyName) {
        this.categoryCode = categoryCode;
        this.categoeyName = categoeyName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoeyName() {
        return categoeyName;
    }

    public void setCategoeyName(String categoeyName) {
        this.categoeyName = categoeyName;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryCode='" + categoryCode + '\'' +
                ", categoeyName='" + categoeyName + '\'' +
                '}';
    }
}
