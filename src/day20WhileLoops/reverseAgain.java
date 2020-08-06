package day20WhileLoops;

public class reverseAgain {
    public static void main(String[] args) {
        String str = "Cybertek";
        String result = "";
        int index = str.length()-1;
        while (index>=0){
result+=str.charAt(index);
            System.out.println(result);
index--;

    }
}}
