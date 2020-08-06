package July12OfficeHours;

public class frequency {
    public static void main(String[] args) {
        String str = "OOPQQ";
        String nonDup = "";
       for(int i =0; i<=str.length()-1;i++){
           String s = ""+ str.charAt(i);
          if(!nonDup.contains(s)){nonDup+=s;
              System.out.println(nonDup);
}}
    String result = "";
        System.out.println("+++++++++++=");
       for (int j=0;j<=nonDup.length()-1;j++){
           char ch1 =nonDup.charAt(j);
           System.out.println(ch1);

       }


    }}
