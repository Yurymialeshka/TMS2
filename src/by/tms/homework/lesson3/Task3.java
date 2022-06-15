package by.tms.homework.lesson3;

import java.util.Scanner;
/*
        Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
        Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день. 
        Программа должна выводить:
        a. Количество дней
        b. Сумму осадков за этот период
        c. Среднее количество осадков за этот период
        d. Максимальное количество дневных осадков за этот период
*/
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sumRain = 0;
        int rainInDay;
        int maxRain = 0;
        System.out.print("Введите количество дней: ");
        int amountOfDay = sc.nextInt();
        System.out.println("Всего дней: " + amountOfDay);

        for (int i = 0; i < amountOfDay; i++) {
            rainInDay = (int) (Math.random() * 100);
            System.out.print(rainInDay + " ");
            if (maxRain < rainInDay) {
                maxRain = rainInDay;
            }
            sumRain += rainInDay;
        }
        System.out.println();
        System.out.println("Сумма осадков выпавшая за введенный период : " + sumRain + " мм");
        System.out.println("Среднее количество осадков за период : " + sumRain / amountOfDay + " мм");
        System.out.println("Максимальное количество осадков : " + maxRain);
    }
}
