package by.tms.homework.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int numConsole = scanner.nextInt();
        int sum = 0;
        while (numConsole > 0) {
            sum = sum + numConsole % 10;
            numConsole = numConsole / 10;
        }
        System.out.println("Сумма чисел : " + sum);
    }
}





