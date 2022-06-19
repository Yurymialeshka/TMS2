package by.tms.homework.lesson4;
/*
Напишите программу, которая циклически сдвигает элементы массива вправо
на одну позицию, и печатает результат. Цикличность означает, что последний
элемент массива становится самым первым его элементом.
 */
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 4, 2};
        System.out.println(Arrays.toString(arr));
        int a = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = a;
        System.out.println(Arrays.toString(arr));
    }
}
