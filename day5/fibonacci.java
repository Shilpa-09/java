package day5;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("enter no of terms");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a=0,b=1,c;

        System.out.print(a+","+b+",9");

        for (int i=0;i<x-2;i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;

        }

    }
}