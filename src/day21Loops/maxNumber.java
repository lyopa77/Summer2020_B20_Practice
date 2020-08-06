package day21Loops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2122222222;
        for (int i = 1; i<=5; i++){
            System.out.println("Enter number");
            int num = scan.nextInt();
            if(num>max){max=num;}


    }
        System.out.println(max);

}

}
