package day35;

import java.util.ArrayList;

public class combine2ArraysList {
    public static void main(String[] args) {


    String [] str = {"a", "b", "c"};
    String str2 [] = {"d", "e", "f"};

    ArrayList <String > studentList = new ArrayList<>();
    for (String each: str){
        studentList.add(each);}
    for (String each:str2){
        studentList.add(each);
    }
        System.out.println(studentList);
}}
