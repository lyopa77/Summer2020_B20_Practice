package day32Methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter first number");
        double firstNum = scan.nextDouble();
        System.out.println("enter operator");
        char oper = scan.next().charAt(0);
        System.out.println("enter second number");
        double secondNum = scan.nextDouble();
        double result =
                calculator(firstNum,oper,secondNum);
        System.out.println("result is " + result);
    }
    public static double calculator(double num1, char operator, double num2){
double result = (operator =='+')?num1+num2:
        (operator=='-')?num1-num2:
                (operator=='*')?num1*num2:
                        (operator=='/')?num1/num2:
                                (operator=='%')?num1%num2:0;
return result;

    }

}
