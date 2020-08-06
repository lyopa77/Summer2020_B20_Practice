package day26;

import java.util.Arrays;

public class multiDArray {
    public static void main(String[] args) {
        String [] testers = {"AL", "Be", "Ce"};
        String []developers = {"a", "b", "c"};
        String []sm = {"bob sm "};
        String []po= {"liz sm"};
        String []ba = {"jad ba"};

       String [][] scrumTeam = {testers, developers, sm, po, ba};
        System.out.println(Arrays.deepToString(scrumTeam));
scrumTeam[4][0] = "Adam";
        System.out.println(Arrays.deepToString(scrumTeam));
        scrumTeam [3][0] = "Rozz";
        System.out.println(Arrays.deepToString(scrumTeam));
    }
}
