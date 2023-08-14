package com.management.category.model.dto;

public class CategoryDTO {

    private String code;
    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    // * 주석을 지우고 제품분류 정보를 담는 객체를 만들 java class를 작성하세요.
    // * 모든 필드는 String 타입으로 작성하시고, CategoryDTO는 productCompany DB의 'PRODUCT_CATEGORY' 테이블과 매핑 가능해야 합니다.
    // * DTO 객체에 대하여 기본적으로 작성해야 하는 사항 5가지 항목을 반드시 작성하세요.

}
