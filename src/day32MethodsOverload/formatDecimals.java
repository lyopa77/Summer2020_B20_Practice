package day32MethodsOverload;

import java.text.DecimalFormat;

public class formatDecimals {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0.0000");
double a =21/7;
        System.out.println(df.format(a));
        System.out.println(a);
        System.out.println(df.format(6));
    }
}
