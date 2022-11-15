package day5;

import java.util.Scanner;

public class isprime {
    static boolean isprime(int x) {
        for (int p = 2; p<x/2; p++){
            if (x % p == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isprime(16));
}
}
