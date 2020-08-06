public class uniques {
    public static void main(String[] args) {
        int[]arr ={1,2,2,3};
         for (int element:arr){

        int count =0;
        for(int b:arr){
            if(element==b){count++;
        }

    }
if(count==1){
    System.out.println(element + " "+count);

}
    }
        System.out.println("========");
    int[]n1 ={1,2,3,2,2,5,6};
uniqueElements(n1);
    }

public static void uniqueElements (int []arr){
    for (int element:arr){

        int count =0;
        for(int b:arr){
            if(element==b){count++;
            }
        }
        if(count==1){
            System.out.println(element + " "+count);
}}
    System.out.println();}}



