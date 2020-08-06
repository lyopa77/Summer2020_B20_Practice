package day29_methods;


public class reverse {
    public static void main(String[] args) {
        reverse("alexey");
    }

    public static void reverse(String str){
        String result ="";
        for (int i = str.length()-1;i>=0;i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }



}
