package ru.gb.jseminar;
import java.util.Date;

import java.util.Scanner;

public class Task2 {

    //В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
    //"Доброе утро, <Имя>!", если время от 05:00 до 11:59
    //"Добрый день, <Имя>!", если время от 12:00 до 17:59;
    //"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    //"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("введите имя: ");
        String name = iScanner.nextLine();
        Date date = new Date();
        // System.out.println(date.toString());
        int hour = date.getHours();
        // System.out.println(hour); 
        if (hour > 4 & hour < 12) System.out.printf("Доброе утро, %s!", name);
        else if (hour > 11 & hour < 18) System.out.printf("Добрый день, %s!", name);
        else if (hour > 17 & hour < 23) System.out.printf("Добрый вечер, %s!", name);
        else System.out.printf("Доброй ночи, %s!", name);
        iScanner.close();

    }

}
