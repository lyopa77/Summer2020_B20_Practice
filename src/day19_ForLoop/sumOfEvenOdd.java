package day19_ForLoop;

public class sumOfEvenOdd {
    public static void main(String[] args){
        int sumOfOdd = 0;

    for (int i=1;i<=99;i+=2){
        sumOfOdd +=i;
for (int j =0;j<=100;j++) {
    if (j % 2 != 0) {
        sumOfOdd += j;
    }

}
        System.out.println(sumOfOdd);
    }}}
