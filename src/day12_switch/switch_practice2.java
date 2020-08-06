package day12_switch;

public class switch_practice2 {
    public static void main(String[] args) {
     String productname = "ipod";
     switch (productname){
         case "galaxy":
             System.out.println("samsung");
             break;

         case "iphone":
         case "ipod":

         case "mac":System.out.println(
                 "apple");
         break;

     }

    }

}
