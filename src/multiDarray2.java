import java.util.Arrays;

public class multiDarray2 {
    public static void main(String[] args) {
int arr2D[][] = {{1,2,3}, {4,5,6},{7,8,9,}};
for(int i = arr2D.length-1;i>=0;i--){
    int [] arr1D = arr2D[i];
    for (int each:arr1D){
        System.out.print(each+ " ");
    }
    System.out.println();
}

    }
}
