package day22_nestedLoop;

public class occurencesOfChar {
    public static void main(String[] args) {
        String str ="ababc";
        char ch = 'a';
        int count =0;
        for(int i=0; i<=str.length()-1;i++){
            char each = str.charAt(i);
            if(each==ch){
                count+=1;
            }

        }
        System.out.println(count);
    }

}

