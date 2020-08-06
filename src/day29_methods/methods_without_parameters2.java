package day29_methods;

public class methods_without_parameters2 {
    public static void main(String[] args) {
        printHello5X();
        System.out.println();
        System.out.println("cybertek");
        printHello5X();
        System.out.println();
        System.out.println("alexey");
        printHello5X();

    }
    public static void printHello5X() {
        for(int i =0; i<=4; i++){
            System.out.print("hello world"+ "  ");}
    }
}
