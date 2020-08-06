package day27_reviews;

public class freqOfWords {
    public static void main(String[] args) {
        String str = "JavajavaJava".toLowerCase();
        int count = 0;
        while(str.contains("java")){
            count++;
            str=str.replaceFirst("java", "python");

        }
        System.out.println(count);
        System.out.println(str);
    }
}
