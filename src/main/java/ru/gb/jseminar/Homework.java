package ru.gb.jseminar;
import java.util.Scanner;
public class Homework {

    //На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
    //- команда 1 (к1): увеличить в с раза, а умножается на c
    //- команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
    //Написать программу, которая выдаёт массив команд, позволяющий число a превратить в число b или сообщить, что это невозможно
    //Пример 1: а = 1, b = 7, c = 1, d = 3
    //ответ: [к1, к1, к1, к1, к1, к1] или [к1, к2, к1, к1, к1] или [к1, к1, к2, к1].
    //Пример 2: а = 11, b = 7, c = 2, d = 1
    //ответ: [].
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();
        System.out.print("Введите c: ");
        int c = in.nextInt();
        System.out.print("Введите d: ");
        int d = in.nextInt();
        in.close();

    }

    public String[] doIt(int a, int b, int c, int d){

        return new String[]{};
    }

}
