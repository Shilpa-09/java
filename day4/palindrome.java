package day4;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("enter a no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int rev=0,r;
        while (n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if (temp==rev)
            System.out.println("it ia a palindrome no");
        else
            System.out.println("not a palindrome");


    }
}
