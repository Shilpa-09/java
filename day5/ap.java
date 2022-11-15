package day5;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        System.out.println("enter a no");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("enter common difference");
        int y=sc.nextInt();
        System.out.println("enter no of terms");
        int z=sc.nextInt();
        int t=x;
        for (int i=0;i<z;i++){
            System.out.print(t +",");
            t=t+y;
        }

    }
}
