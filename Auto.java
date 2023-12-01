package com.telran.org.homeworkeighteen;

public class Auto {

    private String firm;
    private String color;
    private String number;
    private int mileage;
    private int price;

    public Auto(String firm, String color, String number, int mileage, int price) {
        this.firm = firm;
        this.color = color;
        this.number = number;
        this.mileage = mileage;
        this.price = price;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "firm='" + firm + '\'' +
                ", color='" + color + '\'' +
                ", number='" + number + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
