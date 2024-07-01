package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        if (a % 5 == 0) {
            System.out.println("a = " + a);
        }
        if (b % 5 == 0) {
            System.out.println("b = " + b);
        }
        if (c % 5 == 0) {
            System.out.println("c = " + c);
        }
        else if (a % 5 != 0 && b % 5 != 0 && c % 5 !=0 ) {
            System.out.println("Нет значений, кратных 5");
        }

        if (b > 0) {
            int divisionResult = a / b;
            System.out.println(divisionResult);
        }
        double divisionResultFloat = (double) a / b;
        System.out.println(divisionResultFloat);
        int roundedUp = (int) Math.ceil(divisionResultFloat);
        System.out.println(roundedUp);
        int roundedDown = (int) Math.floor(divisionResultFloat);
        System.out.println(roundedDown);
        int roundedMath = (int) Math.round(divisionResultFloat);
        System.out.println(roundedMath);

        int remainder = b % c;
        System.out.println("Остаток от деления b на c: " + remainder);

        int min = Math.min(a, b);
        System.out.println("Наименьшее значение из a и b: " + min);

        int max = Math.max(b, c);
        System.out.println("Наибольшее значение из b и c: " + max);

    }
}