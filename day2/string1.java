package day2;

import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter email id ");
        String str=sc.next();
        System.out.println(str.matches(.*gmail.*));

    }
}
