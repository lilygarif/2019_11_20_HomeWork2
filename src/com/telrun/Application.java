package com.telrun;

public class Application {

    public static void main(String[] args) {
        System.out.println("task 2:");
        task2();
        System.out.println();
        System.out.println();

        System.out.println("task 3a:");
        task3a();
        System.out.println();

        System.out.println("task 3b:");
        task3b();
        System.out.println();

        System.out.println("task 4:");
        task4();


    }

    public static void task2() {
        for (int i = 100; i >= 10; i = i - 10) {
            System.out.print(i + " ");
        }
    }

    public static void task3a() {
        int sum = 0;
        for (int i = 1; i <= 87; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void task3b() {
        int sum = 0;
        for (int i = 5; i <= 86; i += 3) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void task4() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

                 //  ?
    }
}

