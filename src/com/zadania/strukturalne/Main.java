package com.zadania.strukturalne;

public class Main {


    public static int[] find2min(int[] tab) {
        int p1, p2;
        p1 = 0;
        p2 = 1;
        if (tab[p1] > tab[p2]) {
            p1 = 1;
            p2 = 0;
        }
        int i = 2;
        while (i < tab.length) {
            if (tab[i] < tab[p2]) {
                p2 = i;
                if (tab[p1] > tab[p2]) {
                    temp = p1;
                    p1 = p2;
                    p2 = temp;
                }
            }
            i++;
        }
        int[] t = new int[2];
        t[0]= p1;
        t[1]= p2;
        return t;

    }
}