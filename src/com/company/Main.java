package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
//        System.out.print("100 - 800 oralig'idagi son kiriting: ");
//        int n = scanner.nextInt();
//        int t = 0;
//        t = 800-n;
//        System.out.println(n + " dan 800 gacha bo'lgan 3 xonali sonlar " + t + " ta");

//        String s = scanner.nextLine();
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j <s.charAt(i) ; j++) {
//
//            }
//        }
//
//        System.out.println("son1");
//        int a = scanner.nextInt();
//        System.out.println("son1");
//        int b = scanner.nextInt();
//        System.out.println("son1");
//        int c = scanner.nextInt();
//        int t = a + b + a + b;
//        int k =c+c+c+c;
//        int count = 0;
//        for (int i = 0; i <=t ; i++) {
//            if (t-k==k){
//                count++;
//            }
//        }
//        System.out.println(count);
        int n = scanner.nextInt();




        int x = 0;
        int y = 1;
        if(n >= 1) {
            System.out.print(x + " ");
        }
        if(n >= 2) {
            System.out.print(y);
        }
        if (n > 2) {
            for(int a = n - 2; a > 0; a--) {
                int z = y + x;
                System.out.print(" " + z);
                x = y;
                y = z;
            }
        }
    }
}
