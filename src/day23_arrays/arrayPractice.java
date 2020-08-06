package day23_arrays;

public class arrayPractice {
    public static void main(String[] args) {
      String[] names = {"Mike", "Adam", "Tony","John", "Amy"};
      int [] scores = {85, 70, 95, 90, 100};

       /* System.out.println(names[0]+ ":"+scores[0]);
        System.out.println(names[1]+ ":"+scores[1]);
    }*/
for (int i=0; i<=4;i++) {
    System.out.println(names[i]+": " + scores[i]);}
    System.out.println("=============");

String[] classmates = new String[5];
classmates[0]="lyopa";
classmates[1]="max";
classmates[2]="steve";
    for (int i =0;i<=classmates.length-1;i++){
        System.out.println(classmates[i]);

}}}