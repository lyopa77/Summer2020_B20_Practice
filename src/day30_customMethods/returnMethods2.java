package day30_customMethods;

public class returnMethods2 {
    public static void main(String[] args) {
        String name = "level";
       // revStr1(name);
        // System.out.println(name.equalsIgnoreCase());
    String revName = revStr2(name);
        System.out.println(name.equalsIgnoreCase(name));

    }
    public static void revStr1(String str){
String result ="";
for (int i = str.length()-1; i>=0;i--){
    result += str.charAt(i);
}
        System.out.println(result);
    }

    public static String revStr2(String str){
        String result ="";
        for (int i = str.length()-1; i>=0;i--){
            result += str.charAt(i);
        }
        return result;

}


}
