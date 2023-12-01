package com.telran.org.homeworkeighteen;


import java.util.ArrayList;
import java.util.List;

public class Client {

    private int id;
    private int age;
    private String name;
    private List<Phone> phones;

    public Client(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.phones = new ArrayList<>();
    }

    public void addClientPhone (Phone phone){
        phones.add(phone);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<Phone> getPhones() {
        return phones;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", phones=" + phones +
                '}';
    }
}
