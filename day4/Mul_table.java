package day4;

import java.util.Scanner;

public class Mul_table {
    public static void main(String[] args) {
        System.out.println("enter a no: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(x+"x"+i+"="+x*i);
        }
    }
}
