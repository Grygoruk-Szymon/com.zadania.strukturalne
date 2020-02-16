package com.zadania.strukturalne;

public class Recursive {
    public static void main(String[] args) {
        long n =20;
        long r = silnia(n);
        System.out.println(n + "! = "+ r);
    }

    public static long silnia(long n){
        if (n == 0) return 1;
        return n * silnia( n-1);
    }


}
