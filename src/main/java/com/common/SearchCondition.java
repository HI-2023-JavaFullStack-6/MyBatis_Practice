package com.common;

public class SearchCondition {

    private String searchCondition;
    private String searchValue;

    public SearchCondition() {
    }

    public SearchCondition(String searchCondition, String searchValue) {
        this.searchCondition = searchCondition;
        this.searchValue = searchValue;
    }

    public String getSearchCondition() {
        return searchCondition;
    }

    public void setSearchCondition(String searchCondition) {
        this.searchCondition = searchCondition;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    @Override
    public String toString() {
        return "SearchCondition{" +
                "condition='" + searchCondition + '\'' +
                ", value='" + searchValue + '\'' +
                '}';
    }
}


