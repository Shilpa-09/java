package day2;

public class string3 {
    public static void main(String[] args) {
        String str="d book  pen ";
        str=str.replaceAll("\\s+"," ").trim();
        System.out.println(str);
    }
}
