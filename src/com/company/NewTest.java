package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class NewTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        int mus = 0;
        int man = 0;

        if (a1 > 0) {
            mus++;
        } else {
            man++;
        }
        if (a2 > 0) {
            mus++;
        } else {
            man++;
        }
        if (a3 > 0) {
            mus++;
        } else {
            man++;
        }
        if (a4 > 0) {
            mus++;
        } else {
            man++;
        }
        System.out.println("Musbat "+mus);
        System.out.println("Manfiy "+man);

    }
}
