package day12_switch;

public class age_groups {
    public static void main(String[] args) {
        int age = -1;
String ageGroup = "";
if (age >0&&age<=150){
/* {
   if (age <21) {ageGroup = "teenager";}
   else if(age <=55){ageGroup = "adult";}
   else{ageGroup = "senior";}

 */
    ageGroup = (age<21 )? "teenager":(age<55)? "adult":"senior";
    }else{
    ageGroup = "invalid";}
    System.out.println(ageGroup);



}}
