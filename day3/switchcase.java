package day3;

import java.util.Scanner;
import java.lang.*;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("enter 2 nos: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter options in words: ");
        String str=sc.nextLine();
        str=str.toUpperCase();

        switch (str){
            case "ADD":
                System.out.println("sum is "+(x+y));
                break;
            case "SUB":
                System.out.println("subtraction is "+(x-y));
                break;
            case "MUL":
                System.out.println("multiplication is "+(x*y));
                break;
            case "DIV":
                System.out.println("division is "+(x%y));
                break;
            default:
                System.out.println("Invalid option");
                break;
            }
        }


    }

