package day25_practices;
//print first 3 letters of each string
public class chars {
    public static void main(String[] args) {
        String [] words = {"apple", "banana", "pear"};
        for (int i =0; i<=words.length-1;i++) {
            System.out.print(words[i].substring(0, 3));
        }
        System.out.println();
for (String each:words){
    System.out.print(each.substring(0,3) + " ");
    }}

}
