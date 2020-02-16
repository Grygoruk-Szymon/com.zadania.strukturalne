package com.zadania.strukturalne;

import javafx.css.Size;

import java.util.Random;

public class Tablice4 {

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
        for (i = 0; i <tab.length; i++ ) {
            if(tab[i] % 3 ==0) {
                System.out.print(tab[i] + ", ");
            }
        }


    }

}