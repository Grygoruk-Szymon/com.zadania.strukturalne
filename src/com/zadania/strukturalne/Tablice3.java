package com.zadania.strukturalne;

import javafx.css.Size;

import java.util.Random;

public class Tablice3 {

    public static final int SIZE = 10;

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
        for (i = 1; i <tab.length; i+=2 ) {
            System.out.print(tab[i] + ", ");
        }

    }

}
