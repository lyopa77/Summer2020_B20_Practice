package day29_methods;

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "abababccdd";
        removeDup(str);
    }

    public static void removeDup (String str){
     String nonDup = "";
     for ( String each:str.split("") ){
         if (!nonDup.contains(each)){
             nonDup +=each;
         }
     }
        System.out.println(nonDup);
    }

}
