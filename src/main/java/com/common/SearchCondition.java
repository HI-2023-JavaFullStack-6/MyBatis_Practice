package com.common;


/*커먼의 서치컨디션 여기가 DTO역할을 하는거다*/
public class SearchCondition implements java.io.Serializable {

    private String option;
    private String value;

    public SearchCondition() {      }

    public SearchCondition(String option, String value) {
        this.option = option;
        this.value = value;
    }

    public String getOption() { return option;}

    public void setOption(String option) {
        this.option = option;
    }

    public String getValue() {return value;}

    public void setValue(String value) {
        this.value = value;
    }

    public String toString() {
        return "SearchCondition{" +
                "option='" + option + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
    }






