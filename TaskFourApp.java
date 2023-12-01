package com.telran.org.homeworkeighteen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskFourApp {
    public static void main(String[] args) {

        List<Auto> autoList = Arrays.asList(
                new Auto("Mazda", "Black", "WU1314SDK", 123490, 12800),
                new Auto("Mersedes-Benc", "Phantom Black", "DG1314lG", 27012, 23450),
                new Auto("Audi", "Dark Green", "RF1344SK", 123, 48000),
                new Auto("Audi", "White", "WG3333SD", 45609, 49000),
                new Auto("Porsche", "Black", "GB19004K", 0, 49990),
                new Auto("Bentley", "Muscule Red", "CF2344PNH", 520000, 30000),
                new Auto("Chevrolett", "yellow", "CALIFORNIA", 934222, 10000),
                new Auto("Peugeot", "Saphire", "DF4445PF", 250500, 12000),
                new Auto("Ford", "Blue", "SFG444FG", 22234, 27800),
                new Auto("Geely", "Black", "2132-PB3", 0, 23800));

        List<Auto> newCar = autoList.stream()
                .filter(x -> x.getColor().equals("Black") && x.getMileage() == 0)
                .collect(Collectors.toList());
        System.out.println(newCar);

        System.out.println();

        long count = autoList.stream()
                .filter(x -> x.getPrice() >= 30000 && x.getPrice() <= 50000)
                .distinct()
                .count();
        System.out.println(count);
        // работает не корректно, почему-то не срабатывает .distinct(),
        // Перед началом лекции про бафферы и стримы вы сказали добавить оверрайт методы
        // equals и hashcode -- ничего не поменялось

    }
}
