package com.telran.org.homeworkeighteen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TaskThreeApp {
    public static void main(String[] args) {

        Client alex = new Client(001, 27, "Alex");
        Phone alexPhone = new Phone("mobile", 27282930);
        alex.addClientPhone(alexPhone);

        Client serge = new Client(002, 32, "Serge");
        Phone segrePhone = new Phone("landline", 11151617);
        serge.addClientPhone(segrePhone);

        Client andy = new Client(003, 39, "Andy");
        Phone andyPhone = new Phone("mobile", 31323334);
        andy.addClientPhone(andyPhone);

        Client sara = new Client(004, 41, "Sara");
        Phone saraPhone = new Phone("mobile", 11223344);
        sara.addClientPhone(saraPhone);

        Client max = new Client(005, 25, "Max");
        Phone maxPhone = new Phone("landline", 44556677);
        max.addClientPhone(maxPhone);

        Client dave = new Client(006, 18, "Dave");
        Phone davePhone = new Phone("landline", 65646362);
        dave.addClientPhone(davePhone);

        List<Client> clientList = Arrays.asList(alex, andy, sara, serge, max, dave);

        Optional<Client> maxAgeUsingLandline = clientList.stream()
                .filter(x -> x.getPhones().stream().anyMatch(phone -> phone.getType().equals("landline")))
                .max(Comparator.comparing(Client::getAge));
        System.out.println(maxAgeUsingLandline);


    }
}
