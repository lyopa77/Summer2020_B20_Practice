package day31;

public class warmupTask {
    public static void main(String[] args) {
        String str = "aaabbccd";
        String uniques = "";

        for (char each:
                str.toCharArray()){
            int count = frequency(str, each);
            if (count==1){
                uniques+=each;
            }
        }}


    public static int frequency (String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }}
            return count;
    }}





