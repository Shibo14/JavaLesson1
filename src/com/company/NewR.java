package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class NewR {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(in);
        Scanner scanner2 = new Scanner(in);

        String[] a = new String[100];
        String[] b = new String[100];
        int count = 0;
        
        while (true){
            System.out.println("1r");
            System.out.println("2t");
            System.out.println("3fM");
            System.out.println("4fQ");
            System.out.println("5fO'");
            System.out.println("6fs");
            int n = scanner1.nextInt();

            switch (n){
                case 1->{
                    System.out.println("U");
                    String u = scanner2.nextLine();
                    System.out.println("p");
                    String p = scanner2.nextLine();
                    a[count]=u;
                    b[count]=p;
                    System.out.println("god!!!!!");
                }
                
                
                
                
                case 6 ->{
                    for (int i = 0; i < count ; i++) {
                        System.out.println(a[i]);
                        System.out.println(b[i]);
                        System.out.println();

                    }
                }



            }


        }


    }
}
