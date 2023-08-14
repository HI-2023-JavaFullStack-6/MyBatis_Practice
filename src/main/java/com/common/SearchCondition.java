package com.common;

public class SearchCondition {


    private String searchOption;
    private String searchValue;

    public SearchCondition() {

    }

    public SearchCondition(String option, String value) {
        this.searchOption = option;
        this.searchValue = value;
    }

    public String getOption() {
        return searchOption;
    }

    public void setOption(String option) {
        this.searchOption = option;
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
                "option='" + searchOption + '\'' +
                ", value='" + searchValue + '\'' +
                '}';
    }
}
