package day24_arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class uniques {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
String expectedResult = "";
for (int j=0;j<=str.length()-1;j++){
char ch1 =str.charAt(j); //a
 int count =0;
 for(int i =0;i<=str.length()-1;i++){
             char each = str.charAt(i);
            if(ch1==each){
                count+=1;
            }}
        if (count ==1){
            expectedResult+=ch1;}
        }
        System.out.println(expectedResult);
    }


}
