package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] array = new int[n];


        for (int i = 0; i < m; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        int maxi = 0;
        int min = array[0];
        int mini = 0;
        for (int i = 0; i < m; i++) {
            if (max < array[i]) {
                max = array[i];
                maxi = i;
            }
        }
        for (int i = 0; i < m; i++) {
            if (min > array[i]) {
                min = array[i];
                mini = i;
            }
        }
        System.out.println();
        int tmp = array[maxi];
        array[maxi]=array[mini];
        array[mini]=tmp;
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("Max " + max);
        System.out.println("MaxIndex " + maxi);
        System.out.println("Min " + min);
        System.out.println("MinIndex " + mini);


    }
}
