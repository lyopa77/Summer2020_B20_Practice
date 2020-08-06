package day23_arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class frequencyOfCharcters {
    public static void main(String[] args) {
        String str = "ABAB";//A2B2
        String nondup =""; //AB
        String result = ""; //A2B2

        for(int i =0; i<=str.length()-1;i++) {
            String ch = "" + str.charAt(i); //A,B,A,B
            if(!nondup.contains(ch))
                nondup+=ch;

        }

        System.out.println(nondup);
        char ch = nondup.charAt(0);
        int count = 0;
        for(int i =0;i<=str.length()-1;i++){
        if(str.charAt(i)==ch){count+=1;}

    }
result +=nondup.charAt(0)+count;
        System.out.println(result);
}}
