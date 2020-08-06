package day27_reviews;

public class String_and_loops {
    public static void main(String[] args) {
        String str= "cat cat";
int count = 0;
while(str.contains("cat")){count++;
str = str.replaceFirst("cat", "");

    }
        System.out.println(str);



}}
