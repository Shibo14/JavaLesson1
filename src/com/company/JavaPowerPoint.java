package com.company;

public class JavaPowerPoint {
    public static void main(String[] args) {
        int [] arr = {10,15,20};
        System.out.println(getMAx(arr));
        System.out.println(getMin(arr));


    }
    public static int getMAx(int[] a){
        int max = a[0];
        for (int j : a) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
    public static int getMin(int[] a){
        int min = a[0];
        for (int j : a) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }
}
