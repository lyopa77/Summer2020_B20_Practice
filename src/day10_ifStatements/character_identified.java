package day10_ifStatements;

public class character_identified {
    public static void main(String[] args) {
char character = 5;
boolean isDigit = (character > 48 && character <57);
boolean isAlphabetic = (character > 64 && character <91 || character >=97 && character <=122);
boolean specialChar = !isAlphabetic && !isDigit;

       String alphabet = "";
        if (isAlphabetic) { //{System.out.println(character + " is Alphabetic");
            alphabet = (character + " is Alphabetic");
             }else{
        //System.out.println (character + " is not Alphabetic");
alphabet = (character + " is not Alphabetic");
    }
        System.out.println(alphabet);
String digit = "";
if(isDigit){
    digit = character + " is a digit";} else
        {digit = character + " is not a digit"; }

        System.out.println(digit);

String specialCharacter= "";
if (specialChar) {specialCharacter = character + " is a special character";}else
        {
            specialCharacter = character + " is not a special character";}
        }


}
