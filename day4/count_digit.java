package day4;

import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        System.out.println("enter a no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        while (n>0){
            n=n/10;
            c++;
        }
        System.out.println("no of occurance "+c);
    }
}