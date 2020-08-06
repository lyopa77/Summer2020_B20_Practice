package day31;

public class methods_practice2 {
    public static void main(String[] args) {
        String name = "level";
        reverse1(name);
        String rev = reverse2(name);
        System.out.println(reverse2(name));
        System.out.println(name.equalsIgnoreCase(reverse2(name)));
    }

    public static void reverse1(String str){
        String expectedResult = "";
        for (int i =str.length()-1;i>=0;i--){
            expectedResult += str.charAt(i);
        }
        System.out.println(expectedResult);
    }

    public static String reverse2(String str) {
        String expectedResult = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            expectedResult += str.charAt(i);}
            return expectedResult;



    }}
