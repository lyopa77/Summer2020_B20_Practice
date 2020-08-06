package day20WhileLoops;

public class branchingStatement {
    public static void main(String[] args) {
        char ch ='A';
        while(ch <='E'){
            if(ch=='C'){ch++; continue;}
            System.out.println(ch);
            ch++;
    }}
}
