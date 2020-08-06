package day10_ifStatements;

public class grade_calculator {
    public static void main(String[] args) {

    int score = 67;
    String grade = "";

    if (score > 89 && score <=100) {
        grade = "Grade is A";}
    else if (score > 79 && score <90){
        grade = "Grade is B";}
    else if (score > 69 && score <80){grade = "Grade is C";}
    else if (score >59 && score <70){grade = "Grade is D";}
    else  {grade ="Grade is F";}
        System.out.println(grade);



    }


}
