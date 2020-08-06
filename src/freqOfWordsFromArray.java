import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class freqOfWordsFromArray {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "c", "Java"};
        String word = "java";
        int count = 0;
        for (String each : arr) {
            if (!word.equalsIgnoreCase(each)) {
               continue;
            }
           count++;}
        System.out.println(count);
        }

    }



