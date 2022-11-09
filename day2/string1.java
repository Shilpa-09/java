package day2;

import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        String str="shilpa@gmail.com";
        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        String domain=str.substring(i+1,str.length());
        System.out.println("username: "+uname);
        System.out.println("domain name: "+domain);

        System.out.println(domain.startsWith("gmail"));



    }
}
