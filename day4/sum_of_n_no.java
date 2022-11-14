package day4;

import java.util.Scanner;

public class sum_of_n_no {
    public static void main(String[] args) {
        System.out.println("enter a no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println("sum of the nos is :"+sum);
    }
}
