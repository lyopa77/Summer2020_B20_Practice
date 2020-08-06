package offifceHoursJuly28thMethods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class reverseMethod {
    public static void main(String[] args) {
String name = "alex";
reverse(name);
        System.out.println(reverse(name));
        System.out.println(reverse(name).toUpperCase());
        isPalindrome("level");
        isPalindrome (name);
        System.out.println("===============");
        String[]names = {"alex", "beta", "cara", "Delta"};
        ArrayList<String>nameList = new ArrayList<>();
        for (String each:names){
           // System.out.println(reverse(each));
            // isPalindrome(each);
            nameList.add(reverse(each));
        }
        System.out.println(nameList);
    }
    public static String reverse (String str){
        String result = "";
        for (int i= str.length()-1;i>=0;i--){
            result += str.charAt(i);
        }
        return result;

    }

    public static void isPalindrome (String str){
        String reversedStr = reverse(str);
        boolean palindrome = str.equalsIgnoreCase(reversedStr);
        System.out.println(palindrome?str +" is palindrome":str+" is not palindrome");

    }
}
