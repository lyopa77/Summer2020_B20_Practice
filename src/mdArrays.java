import java.util.Arrays;

public class mdArrays {
    public static void main(String[] args) {
        String [] classmates = {"sa0", "de0","fr0"};
        String [] classmates2 = {"sa1", "de1","fr1"};
        String [] classmates3 = {"sa2", "de2","fr2"};
        String [] classmates4 = {"sa3", "de3","fr3"};
        String [] classmates5 = {"sa4", "de4","fr4"};
String [][] group = {classmates, classmates2,classmates3,classmates4,classmates5};
        for (int i =0; i<=group.length-1;i++){ //each array
            String[] eachGroup = group[i];
            //System.out.println(Arrays.toString(eachGroup));
           for (int j=0;j<=eachGroup.length-1;j++)//each name
           {String eachStudent = eachGroup[j];
           if (eachStudent.toLowerCase().contains("d")){
    System.out.print(eachStudent + " ");}
               System.out.println();
        }

    }}}


