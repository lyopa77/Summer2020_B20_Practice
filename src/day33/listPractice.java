package day33;

import java.util.ArrayList;

public class listPractice {
    public static void main(String[] args) {
        ArrayList<Integer>oddlist=new ArrayList<>();
        ArrayList<Integer>evenlist=new ArrayList<>();

        for(int i =0; i<=100; i++){
            if(i%2==0){
                evenlist.add(i);}else{oddlist.add(i);
            }
        }
        System.out.println(oddlist.toString());
        System.out.println(evenlist.toString());
        System.out.println("==========");

        ArrayList<String> groceryList = new ArrayList<>();
groceryList.add("milk");
groceryList.add("cereal");
groceryList.add("eggs");
groceryList.add("water");

for(int i = groceryList.size()-1; i>=0;i--){
    System.out.print(groceryList.get(i)+"   ");
}
        System.out.println();
for(String each:groceryList){
    System.out.print(each+ "  ");

    }
}}
