package com.telran.org.homeworkeighteen;

public class Phone {

    private String type;
    private int number;

    public Phone(String type, int number) {
        this.type = type;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "type='" + type + '\'' +
                ", number=" + number +
                '}';
    }
}
