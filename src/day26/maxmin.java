package day26;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class maxmin {
    public static void main(String[] args) {


        String [] names = {"ab", "abc","a", "b", "C"};
        for (String each:names){if(!each.contains("c")){continue;}
            System.out.println(each +" ");
    }


        System.out.println("============");



        int [] score = {1,2,3,4,5,6};
        int max = score[0];
        int min = score[0];
        for (int each:score){if (each>max){max=each;}
        if (each<min){min=each;}}
        System.out.println("min: "+min);
        System.out.println("max: "+max);
        System.out.println("=========");




}}

