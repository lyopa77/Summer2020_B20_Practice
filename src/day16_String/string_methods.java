package day16_String;

public class string_methods {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";
        email = email.replace("gmail", "yahoo");
        System.out.println(email);

        String word = "java";
        word = word.replace("a", "e");
        System.out.println(word);

        String sentence = "I like to learn Java, Java is fun";
        sentence = sentence.replace("Java", "c#");
        System.out.println(sentence);

    }

}
