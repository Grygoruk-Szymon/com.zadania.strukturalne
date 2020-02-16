package com.zadania.strukturalne;

import java.util.Random;

import static com.zadania.strukturalne.Tablice.printTab;


public class Sorting<oublic> {
    public static final int SIZE = 100000000;

    public static void main(String[] args) {
        Random rand = new Random();


        int tab[] = new int [SIZE];

        for (int i = 0; i < SIZE ; i++) {
            tab[i] = rand.nextInt();
        }


        printTab(tab);
        long t1 = System.currentTimeMillis();
        BubbleSort(tab);
        long t2 = System.currentTimeMillis();
        printTab(tab);
        System.out.println("czas sortowania "+ (t2-t1));


        long t3 = System.currentTimeMillis();
        SelectionSort(tab);
        long t4 = System.currentTimeMillis();
        printTab(tab);
        System.out.println("czas sortowania "+ (t4-t3));
    }
    public static void BubbleSort(int[] tab){
     int temp;
        for (int i = 0; i <tab.length -1 ; i++) {
            for (int j = 0; j <tab.length -1 ; j++) {
                if(tab[j]>tab[j+1]){
                    temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] tab){
        int pmin, temp;
        for (int i = 0; i < tab.length - 1; i++) {
            pmin = i;
            for (int j = i+1; j <tab.length ; j++) {
                if(tab[pmin] > tab[j]) pmin = j;
            }
            temp = tab[pmin];
            tab[pmin] = tab [i];
            tab [i] = temp;
        }


    }
}
