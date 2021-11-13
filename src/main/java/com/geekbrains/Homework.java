package com.geekbrains;

public class Homework {

    public static void main(String[] args) {

        // Домашнее задание №2
        int a;
        int b;

        a = 5;
        b = 7;
        Boolean task1True = checkIfSumInRange(a,b);
        System.out.printf("Сумма чисел %d и %d равная %d в диапозоне от 10 до 20 = %s%n",a,b,a+b,boolRus(task1True));

        a = 12;
        b = 9;
        Boolean task1False = checkIfSumInRange(a,b);
        System.out.printf("Сумма чисел %d и %d равная %d в диапозоне от 10 до 20 = %s%n",a,b,a+b,boolRus(task1False));

        positiveOrNegative(6);
        positiveOrNegative(-11);
        positiveOrNegative(0);

        a = -6;
        Boolean task3True = negativeInt(a);
        System.out.printf("Число %d отрицательное = %s.%n",a,boolRus(task3True));

        a = 7;
        Boolean task3False = negativeInt(a);
        System.out.printf("Число %d отрицательное = %s.%n",a,boolRus(task3False));

        printNTimes("Напечатай строку", 3);

        int year = 1980;
        Boolean leapYear = isLeapYear(year);
        System.out.printf("Год %d високосный = %s.%n",year,boolRus(leapYear));
    }

    private static String boolRus(Boolean bool) {
        return bool ? "Да" : "Нет";
    }

    private static Boolean checkIfSumInRange(int a, int b) {
        return a+b >= 10 && a+b <= 20;
    }

    private static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.printf("Число %d положительное.%n",a);
        } else {
            System.out.printf("Число %d отрицательное.%n",a);
        }
    }

    private static Boolean negativeInt(int a) {
        return a < 0;
    }

    private static void printNTimes(String printString, int nTimes) {
        for (int i = 0; i < nTimes; i++) {
            System.out.printf("Вывод строки '%s' в количестве %d, итерация №%d%n",printString,nTimes,i+1);
        }
    }

    private static Boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

}


