package da11_nestedIf_ternary;

public class ternary_Practice2 {
    public static void main(String[] args) {
        int num = 0;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        String result2 = num>0? "positive" : num<0? "negative":"zero";
        System.out.println(result);
        System.out.println(result2);

    }
}
