package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithm {
    public static void checkNumber(){
        System.out.println("Введите число:");
        var in = new Scanner(System.in);
        if (in.hasNextDouble()) {
            double number = in.nextDouble();
            if (number > 7.0)
                System.out.println("Привет");
            else
                System.out.println("<=7");
        }
        else
            System.out.println("Некорректный формат ввода");
    }
    public static void checkName(){
        System.out.println("Введите имя:");
        var in = new Scanner(System.in);
        String name = in.next();
        if (name.equals("Вячеслав"))
            System.out.println("Привет, Вячеслав");
        else
            System.out.println("Нет такого имени");
    }
    public static void arrayFunction(){
        System.out.println("Введите размер массива:");
        var in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int size = in.nextInt();
            if (size > 0) {
                int[] array = new int[size];
                System.out.println("Введите значения массива:");
                for (int i = 0; i < size; i++) {
                    if (in.hasNextInt())
                        array[i] = in.nextInt();
                    else {
                        System.out.println("Введены некорректные данные");
                        return;
                    }
                }
                System.out.println("Введенный массив:");
                System.out.println(Arrays.toString(array));
                System.out.println("Элементы кратные трем:");
                for (int element : array) {
                    if (element % 3 == 0) System.out.print(element + " ");
                }
            }
            else
                System.out.println("Размер массива должен быть больше 0");
        }
        else
            System.out.println("Некорректный формат для размера массива");
    }
}
