package day25_practices;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class longestString {
    public static void main(String[] args) {
        String [] arr= {"Lyop", "max", "peter", "adam", "Jonah"};
        int maxLength = arr[0].length();
        for (String each:arr){
            if (each.length()>maxLength)
            {maxLength=each.length();
        }

    }
        for (String each:arr){if(each.length()==maxLength){
            System.out.println(each);}}
}}
