package day16_String;

public class checkWords {
    public static void main(String[] args) {
        String str ="";
        //last index = length-1
        //second last index = length-2
        //third last index = length -3
        if(str.length()==0){
            System.out.println("empty string");}else if(str.length()>3)
            {
                System.out.println(str.substring(str.length()-3));}else{
            System.out.println(str);}

    }

}
