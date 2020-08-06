package day32Methods;
import library.util;
public class methodCalls {
    public static void main(String[] args) {
        String firstName = "alEx";
        String lastName = "viNes";
        String fullName;
        fullName = util.formatFullName(firstName, lastName);
        System.out.println(fullName);
        String uniques = util.uniques(fullName.toLowerCase());
        System.out.println(uniques);
    }


}
