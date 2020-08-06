package day31;
import library.util;

public class frequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabbccddd";

        String expectedResult = "";

        String nonDup = util.removeDup(str);
        for (char each:nonDup.toCharArray()){

            int count1 = util.frequency(str, each);
            expectedResult += ""+each+count1;

        }

      /*  char ch1 = nonDup.charAt(0);
        int count1 = util.frequency(str, ch1);
        expectedResult += ""+ch1+count1;

    */
        System.out.println(expectedResult);
    }
    public static String FrequencyOfChars (String str) {
        String expectedResult = "";

        String nonDup = util.removeDup(str);
        for (char each : nonDup.toCharArray()) {

            int count1 = util.frequency(str, each);
            expectedResult += "" + each + count1;

        }
        return expectedResult;


    }}
