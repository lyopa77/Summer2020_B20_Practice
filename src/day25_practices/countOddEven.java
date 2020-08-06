package day25_practices;

public class countOddEven {
    public static void main(String[] args) {
int []nums = {1,2,3,4,5,6,7,8,9};
int odd = 0;
int even = 0;
for (int each:nums){
    if (each % 2 == 0) {
        even += 1;
    }else{odd++;}
    }
        System.out.println(even);
        System.out.println(odd);
}


    }

