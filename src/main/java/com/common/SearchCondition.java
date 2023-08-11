package com.common;

public class SearchCondition implements java.io.Serializable{

    private String searchOption;
    private String searchValue;


    @Override
    public String toString() {
        return "SearchCondition{" +
                "searchOption='" + searchOption + '\'' +
                ", searchValue='" + searchValue + '\'' +
                '}';
    }

    public String getSearchOption() {
        return searchOption;
    }

    public void setSearchOption(String searchOption) {
        this.searchOption = searchOption;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public SearchCondition(String searchOption, String searchValue) {
        this.searchOption = searchOption;
        this.searchValue = searchValue;
    }

    public SearchCondition() {
    }
}
