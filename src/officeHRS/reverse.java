package officeHRS;
//In this task, you need to swap first name with last name in the email.
// If email doesn't contains underscore - do not anything.
import java.util.Scanner;

public class reverse {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String email = scan.nextLine();
            int indexUnderscore = email.indexOf("_");
            int indexAt = email.indexOf("@");
            String extension = email.substring(indexAt + 1);
            String firstName = email.substring(0,indexUnderscore);
            String lastName = email.substring((indexUnderscore+1), indexAt);
            if (email.contains("_")){
                System.out.println(lastName+"_"+firstName+"@"+extension);}else
            {System.out.println(email);}


        }}
