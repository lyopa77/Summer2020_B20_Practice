package day26;

import java.sql.SQLOutput;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        String sentence = "I love Java, Python, Python, Java";
        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
int countJAva = 0;
int countPython = 0;
for(String each :words){
    if (each.toLowerCase().contains("java")) {countJAva++;
        }else if (each.toLowerCase().contains("python")){countPython++;

}}
        System.out.println("count of Java: "+ countJAva);
        System.out.println("count of Python: " + countPython);
    }
}
