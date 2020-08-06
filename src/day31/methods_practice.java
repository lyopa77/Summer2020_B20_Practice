package day31;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class methods_practice {
    public static void main(String[] args) {
        max(1,2);
        int b = max2(10,20);
        System.out.println(max2(10, 20));

    }
    public static void max(int a, int b) {
        int max = a>b?a:b;
        System.out.println(max);}

    public static int max2(int a, int b) {
        return (a > b) ? a : b;

    }

}



