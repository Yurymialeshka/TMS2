package by.tms.homework.lesson4;
/*Написать программу, которая преобразовывает двумерный массив
в одномерный массив со всеми элементами двумерного.*/

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[][] dimArr = new int[4][5];
        for (int i = 0; i < dimArr.length; i++) {
            for (int j = 0; j < dimArr[i].length; j++) {
                dimArr[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(dimArr));
        int tmp = 0;
        int index = 0;
        for (int i = 0; i < dimArr.length; i++) {
            for (int j = 0; j < dimArr[i].length; j++) {
                tmp++;
            }
        }
        int[] arr = new int[tmp];
        for (int i = 0; i < dimArr.length; i++) {
            for (int j = 0; j < dimArr[i].length; j++) {
                arr[index] = dimArr[i][j];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
