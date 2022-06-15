package by.tms.homework.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        int a = 0;
        for (int i = 1; i <= num; i++) {
            a += i;
        }
        System.out.println("Сумма цифр: " + a);

    }
}
