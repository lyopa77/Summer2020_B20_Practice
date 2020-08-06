package day28_reviews;

public class tasks1 {
    //frequency of word//
    public static void main(String[] args) {
        String str = "javajava";
        int count =0;
        for (int i =0; i<str.length();i++){
String s = str.substring(i);
if(s.equals("java")){count++;}}

        System.out.println(count
        );
    }

}
