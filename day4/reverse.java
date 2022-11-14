package day4;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("enter a no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0,r;
        while (n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
    }
}