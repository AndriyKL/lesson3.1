package com.company;

public class Main {

    public static void main(String[] args) {

        func(6);

        System.out.println(fibRecursive(6));
    }


    public static void func(int a) {
        int[] array = new int[a];


        for (int i = 0; i < a; i++) {
            if (i == 0 | i == 1) {
                array[i] = i;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
            System.out.println(array[a-1]);

    }

    public static int fibRecursive(int n) {
        if(n == 1 ) {
            return 0;
        }
        if(n == 2) {
            return 1;
        }
        return fibRecursive(n-1) + fibRecursive(n-2);
    }
}


