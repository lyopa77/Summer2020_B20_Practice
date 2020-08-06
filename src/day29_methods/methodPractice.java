package day29_methods;

public class methodPractice {
    public static void main(String[] args) {
        oddNumbers();
        System.out.println("hello");
        oddNumbers();
        System.out.println("hello");
        evenNumbers();

    }
public static void oddNumbers(){
    for (int i =1; i<=100;i+=2){
        System.out.print(i+" ");
}
    System.out.println();
}

public static void evenNumbers(){
    for (int j =0; j<=100; j+=2){
        System.out.print(j+ " ");
    }
    System.out.println();
    }
}
