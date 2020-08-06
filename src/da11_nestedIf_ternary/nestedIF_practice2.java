package da11_nestedIf_ternary;

public class nestedIF_practice2 {
    public static void main(String[] args) {
        int day = 4;
        boolean validNumber = day>=1 && day<=7;
        String result ="";
     /*   if (validNumber) { if (day == 7){result ="sunday";}
         else if(day==6){result = "saturday";}
        else if(day==5){result = "friday";}
        else if(day==4){result = "thursday";}
        else if(day==3){result = "wed";}
        else if(day==2){result = "tue";}
        else if(day==1){result = "mon";}

   } else {result = "invalid";}
   */
      result = (day==7)? "Sunday" :
              (day==6)?"Saturday":
                      (day==5)?"fri":
                        (day==4)?"thurs":
                                (day==3)?"wed":
                                        (day==2)?"tues":
                                                (day==1)?"mon":"invalid";

        System.out.println(result);


    }

}
