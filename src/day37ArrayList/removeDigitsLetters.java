package day37ArrayList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDigitsLetters {
    public static void main(String[] args) {
ArrayList<Character>chars = new ArrayList<>();
chars.addAll(Arrays.asList('a', '1', '2', 'c', '$', '@'));
chars.removeIf(p->Character.isDigit(p)||Character.isLetter(p));
        System.out.println(chars);
}}

