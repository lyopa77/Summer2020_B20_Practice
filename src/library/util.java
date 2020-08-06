package library;

import java.util.Arrays;

public class util {
    public static String removeDup(String str) {
        String nonDup = "";
        for (String each : str.split("")) {
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        return (nonDup);
    }

    //removes dups and returns a string
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return (result);
    }

    //reverses a string and returns a value
    public static int maxNum(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    public static Integer maxNum(Integer[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static double maxNum(double[] arr) {
        double max = arr[0];
        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    public static Double maxNum(Double[] arr) {
        Double max = arr[0];
        for (Double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    //max num
    public static int minNum(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static Integer minNum(Integer[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static Double minNum(Double[] arr) {
        Double min = arr[0];
        for (Double each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    //
    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

    public static String uniques(String str) {
        String uniques = "";

        for (char each :
                str.toCharArray()) {
            int count = frequency(str, each);

            if (count == 1) {
                uniques += each;

            }
        }
        return uniques;
    }

    public static String FrequencyOfChars(String str) {
        String expectedResult = "";

        String nonDup = util.removeDup(str);
        for (char each : nonDup.toCharArray()) {

            int count1 = util.frequency(str, each);
            expectedResult += "" + each + count1;

        }
        return expectedResult;
    }
    public static String formatFullName(String first, String last){
        first = first.substring(0, 1).toUpperCase()+ first.substring(1).toLowerCase();

        last = last.substring(0,1).toUpperCase()+ last.substring(1).toLowerCase();
        String fullName = first + " "+ last;
        return fullName = "";

    }


    public static int[] addElement(int[] arr, int num) {
        int[] arr2 = new int[arr.length + 1];
        arr2[arr2.length - 1] = num;

        int i = 0;
        for (int each : arr) {
            arr2[i] = each;
            i++;
        }
        return arr2;
    }

    public static int[] sortDescending(int[]arr){

        Arrays.sort(arr);
        int [] arr2 = new int[arr.length];

        int k = arr.length-1;
        for (int i=0; i<=arr.length-1;i++){
            arr2[i]=arr[k];
            k--;}
        return arr2; }

    public static Integer[] sortDescending(Integer[]arr){

        Arrays.sort(arr);
        Integer [] arr2 = new Integer[arr.length];

        int k = arr.length-1;
        for (int i=0; i<=arr.length-1;i++){
            arr2[i]=arr[k];
            k--;}
        return arr2; }

    public static Character[] sortDescending(Character[]arr){

        Arrays.sort(arr);
        Character [] arr2 = new Character[arr.length];

        int k = arr.length-1;
        for (int i=0; i<=arr.length-1;i++){
            arr2[i]=arr[k];
            k--;}
        return arr2; }

    public static String[] sortDescending(String[]arr){

        Arrays.sort(arr);
        String [] arr2 = new String[arr.length];

        int k = arr.length-1;
        for (int i=0; i<=arr.length-1;i++){
            arr2[i]=arr[k];
            k--;}
        return arr2; }

    public static double [] sortDescending(double[]arr){
        Arrays.sort(arr);
        double [] arr2 = new double[arr.length];

        int k = arr.length-1;
        for (int i=0; i<=arr.length-1;i++){
            arr2[i]=arr[k];
            k--;}
        return arr2; }
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
        System.out.println();}

    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;}

    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2){
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        return arr3;}}