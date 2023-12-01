package com.telran.org.homeworkeighteen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTwoApp {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Abra","Kadabra","Potato",
                "Motato","Hacuna","Matata",
                "Timon","Pumba","David");
        System.out.println("Unsorted List: " + stringList);
        System.out.println();

        List<String> collect = stringList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted List : " + collect);
//                .forEach(x-> System.out.print(x + " "));
    }
}
