package day15_String;

public class subString {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        //                 System.out.println ("Number of Candies: "+ candies)012345678910...
        //substring(beg index, end index)(ending index is always excluded)
        String word = sentence.substring(0,3+1);//==(0,4)
        System.out.println(word);

        String word2 = sentence.substring(8,11);//8, 10+1;
        System.out.println (word2);



    }

}
