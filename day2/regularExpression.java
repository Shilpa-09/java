package day2;

public class regularExpression {
    public static void main(String[] args) {

        int a=1000101;
        String str= String.valueOf(a);
        System.out.println(str.matches("[01]+"));
    }
}
