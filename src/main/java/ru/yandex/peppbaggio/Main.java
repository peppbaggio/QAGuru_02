package ru.yandex.peppbaggio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Вводятся два целых числа: a, b - коэффициенты линейного уравнения a * x + b = 0.
        // Определите количество его корней.

        Scanner scan = new Scanner(System.in);
        int numA = scan.nextInt();
        int numB = scan.nextInt();

        if (numA != 0) {
            System.out.println("1");
        } else if (numA == 0 && numB != 0) {
            System.out.println("0");
        } else if (numA == 0 && numB == 0) {
            System.out.println("inf");
        }
    }
}


