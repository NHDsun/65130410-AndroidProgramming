package com.example.bth7_listview01.model;

public class Product {
    private String productId;
    private String name;
    private String description;
    private double price;
    private String categoryId;
    private boolean isService;   // 0: sản phẩm, 1: dịch vụ
    private int stock;
    private String imageUrl;
    private boolean isDeleted;   // xóa mềm

    public Product() {
        // constructor rỗng cho Firebase
    }

    public Product(String productId, String name, String description,
                   double price, String categoryId,
                   boolean isService, int stock,
                   String imageUrl, boolean isDeleted) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
        this.isService = isService;
        this.stock = stock;
        this.imageUrl = imageUrl;
        this.isDeleted = isDeleted;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public boolean isService() {
        return isService;
    }

    public int getStock() {
        return stock;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setService(boolean service) {
        isService = service;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
