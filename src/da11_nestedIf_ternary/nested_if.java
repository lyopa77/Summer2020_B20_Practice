package da11_nestedIf_ternary;

public class nested_if {
    public static void main(String[] args) {
        int score = 102;
        String result="";
        if (score>=0 && score<=100) {
            if (score >=90){result = "a";}else if (score >=80) {result = "B";}
            else if (score>=70){result = "C";}
            else if (score>=60){result = "D";}
            else {result = "E";}}
        else result = "invalid";
        System.out.println(result);
        System.out.println("==============");







    }}

