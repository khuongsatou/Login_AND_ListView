package com.example.screenloginandcustomlistview.Brands;

public class Brands {
    private int brands;
    private String title;

    public Brands(int brands, String title) {
        this.brands = brands;
        this.title = title;
    }

    public int getBrands() {
        return brands;
    }

    public void setBrands(int brands) {
        this.brands = brands;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
