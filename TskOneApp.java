package com.telran.org.homeworkeighteen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TskOneApp {
    public static void main(String[] args) {

        List<String> listSurnames = Arrays.asList("Malcovich","Kreig",
                "Brown","Setter","Sterlig",
                "Kolins","Madows","Krownberg");

        List<String> containsK = listSurnames.stream()
                .filter(x -> x.contains("K"))
                .collect(Collectors.toList());
        System.out.println(containsK);

    }
}
