package com.company;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
//        int n = 123321; // berilgan son
//
//        int num = n; //
//        int temp;
//        int reverseNum = 0;
//
//        for (; num != 0; ) {
//            temp = num % 10;
//            reverseNum = reverseNum * 10 + temp;
//
//            num = num / 10;
//        }
//        System.out.println(num);
//
//        if(n == reverseNum){
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        invertDigit(a, b, c);


    }
    public static void invertDigit(int a, int b, int c) {
        int t1, t2, t3;
        int s1 = 0, s2 = 0, s3 = 0;
        while (a != 0) {
            t1 = a % 10;
            s1 = s1 * 10 + t1;
            a /= 10;
        }

        while (b != 0) {
            t2 = b % 10;
            s2 = s2 * 10 + t2;
            b /= 10;
        }

        while (c != 0) {
            t3 = c % 10;
            s3 = s3 * 10 + t3;
            c /= 10;
        }
        System.out.println("a sonini teskarisi = " + s1);
        System.out.println("b sonini teskarisi = " + s2);
        System.out.println("c sonini teskarisi = " + s3);
    }
}
