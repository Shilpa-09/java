package day5;

import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        System.out.println("enter a,r,n");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int term=x;
        for (int i=0;i<z;i++){
            System.out.print(term +",");
            term=term*y;
        }
    }
}