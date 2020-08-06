package day29_methods;

public class uniqueElements {
    public static void main(String[] args) {
        String [] arr = {"a", "b", "b", "c"};
        uniques(arr);
        System.out.println("hello");
        String [] arr2 = {"d", "d", "e", "f"};
    }
    public static void uniques(String[]arr){
        for (String a:arr){
            int count =0;
            for (String each:arr){
                if(a.equals(each)){count++;}}
            if (count==1){
                System.out.println(a+ " ");
            }
        }



    }


}
