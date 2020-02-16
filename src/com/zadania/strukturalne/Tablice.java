package com.zadania.strukturalne;

import java.util.Random;

public class Tablice {

    public static final int SIZE = 100;

    public static void main(String[] args) {

        Random rand = new Random();

        int tab[] = new int[SIZE];

        for (int i = 0; i < SIZE; i++){
            tab[i] = rand.nextInt(SIZE);
        }

        printTab(tab);

    }

    public static void printTab(int[] tab) {
        int i;
        for ( i = 0; i < tab.length - 1; i++ ) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[i-1]);
    }

}
