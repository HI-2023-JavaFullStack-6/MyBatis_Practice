package com.management.product.model.dto;

public class ProductDTO implements java.io.Serializable {

    private String code;
    private String name;
    private String cost;
    private String date;
    private String rate;
    private String salesQ;
    private String stockQ;
    private String catCode;
    private String proStat;

    public ProductDTO() {
    }

    public ProductDTO(String code, String name, String cost, String date, String rate, String salesQ, String stockQ, String catCode, String proStat) {
        this.code = code;
        this.name = name;
        this.cost = cost;
        this.date = date;
        this.rate = rate;
        this.salesQ = salesQ;
        this.stockQ = stockQ;
        this.catCode = catCode;
        this.proStat = proStat;
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

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getSalesQ() {
        return salesQ;
    }

    public void setSalesQ(String salesQ) {
        this.salesQ = salesQ;
    }

    public String getStockQ() {
        return stockQ;
    }

    public void setStockQ(String stockQ) {
        this.stockQ = stockQ;
    }

    public String getCatCode() {
        return catCode;
    }

    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    public String getProStat() {
        return proStat;
    }

    public void setProStat(String proStat) {
        this.proStat = proStat;
    }
    @Override
    public String toString() {
        return "ProductDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                ", date='" + date + '\'' +
                ", rate='" + rate + '\'' +
                ", salesQ='" + salesQ + '\'' +
                ", stockQ='" + stockQ + '\'' +
                ", catCode='" + catCode + '\'' +
                ", proStat='" + proStat + '\'' +
                '}';
    }

    public void setFormattedDate(String formattedDate) {
    }

    // * 주석을 지우고 제품 정보를 담는 객체를 만들 java class를 작성하세요.
    // * 모든 필드는 String 타입으로 작성하시고, ProductDTO productCompany DB의 'PRODUCT_INFO' 테이블과 매핑 가능해야 합니다.
    // * DTO 객체에 대하여 기본적으로 작성해야 하는 사항 5가지 항목을 반드시 작성하세요.

}
