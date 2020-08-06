package day17_heapVspool;

public class poolHeap {
    public static void main(String[] args) {
        String s1 = "Cybertek";//String pool
        String s2 = "Cybertek";//String pool
        String s3 = new String("Cybertek");//heap

        System.out.println(s1==s2);
        System.out.println(s1==s3);



    }
}
