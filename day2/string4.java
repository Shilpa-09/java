package day2;

public class string4 {
    public static void main(String[] args) {
        String str="   jf  sklj  f   mfndn mdllfjw  ";
        str=str.replaceAll("\\s+"," ").trim();
        String w[]=str.split("\\s");
        System.out.println(w.length);

    }
}
