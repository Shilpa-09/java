package day1;
import java.lang.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class arithmatic {
    public static void main(String[] args) {
        float b,h,a;
        System.out.println("Enter base and height");
        Scanner sc=new Scanner(System.in);
        b=sc.nextFloat();
        h=sc.nextFloat();
        a=b*h/2;
        System.out.println("area is "+a);

    }
}
