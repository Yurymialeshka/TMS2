package by.tms.homework.lesson4;

        /*Написать программу, удаляющую все целые числа из массива,
        которые равны тому, что ввёл пользователь. В результате
        должен получиться новый массив, в котором нет заданных
        элементов. Распечатать полученный массив.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrFirst = new int[10];
        for (int i = 0; i < 10; i++) {
            arrFirst[i] = (int) (Math.random() * 10);
        }
        System.out.println("Есть такой массив : " + Arrays.toString(arrFirst));
        System.out.print("Введите число которое хотите удалить из массива : ");
        int numConsole = sc.nextInt();
        int attemps = 0;
        for (int i : arrFirst) {
            if (i == numConsole)
                attemps++;
        }
        int[] arrSecond = new int[arrFirst.length - attemps];
        int indexArrSecond = 0;
        for (int i : arrFirst) {
            if (i != numConsole) {
                arrSecond[indexArrSecond] = i;
                indexArrSecond++;
            }
        }
        if (attemps == 0) {
            System.out.println("Нет такого числа в массиве!");
        } else
            System.out.println("Получился такой массив : " + Arrays.toString(arrSecond));
    }
}
