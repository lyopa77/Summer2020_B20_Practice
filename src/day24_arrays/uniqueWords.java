package day24_arrays;

public class uniqueWords {
    public static void main(String[] args) {
        String [] words = {"C#", "C#", "Java", "Python", "Python", "C++"};
        String s =words[0];
        int count = 0;//to assign freq of s
        for (int i=0;i<=words.length-1;i++){
        String each = words[i];
        if(s.equals(each)){count++;}


    }

if(count ==1){
        System.out.println(s);
    }}}
