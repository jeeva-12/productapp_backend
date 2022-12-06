package com.example.productapp_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue
    private int id;
    private String productName;
    private int productcode;
    private String manu_date;
    private String exp_date;
    private String beand;
    private int price;
    private String sellerName;
    private String distributerName;

    public Products() {
    }

    public Products(int id, String productName, int productcode, String manu_date, String exp_date, String beand, int price, String sellerName, String distributerName) {
        this.id = id;
        this.productName = productName;
        this.productcode = productcode;
        this.manu_date = manu_date;
        this.exp_date = exp_date;
        this.beand = beand;
        this.price = price;
        this.sellerName = sellerName;
        this.distributerName = distributerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    public String getManu_date() {
        return manu_date;
    }

    public void setManu_date(String manu_date) {
        this.manu_date = manu_date;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public String getBeand() {
        return beand;
    }

    public void setBeand(String beand) {
        this.beand = beand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getDistributerName() {
        return distributerName;
    }

    public void setDistributerName(String distributerName) {
        this.distributerName = distributerName;
    }
}
