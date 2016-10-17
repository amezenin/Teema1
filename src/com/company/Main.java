package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        System.out.println("Osa 1");
        int a = 10;
        while (a > 0) {

            System.out.println(a);
            a--;

        }
        System.out.println("Osa 2");

        int b = 0;
        while (b < 10) {
            b++;
            if (b % 2 == 0){
                System.out.println(b);
            }

        }

        System.out.println("Osa 3");
        int tabel [][] = new int [10][10];
        int count1 = 0;
        int count2 = 0;
        while (count1 < 10) {
            count2 = 0;
            while (count2 < 10) {
                for (int i = 0; i < 10; i++) {
                    tabel [count1][count2] = count1 + count2;
                    count2++;
                }

            }
            count1++;

        }
        int count3 = 0;
        while (count3 < 10) {
            System.out.println(Arrays.toString(tabel[count3]));
            count3++;
        }


        // write your code here
    }

}
