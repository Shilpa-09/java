package day2;

public class string2 {
    public static void main(String[] args) {
        String str="jsf489!3@#j";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
    }
}
