package day13_ScannerContinued;

public class browsers {
    public static void main(String[] args) {
        String browserName = "other";
        switch(browserName){
            case "chrome":
                System.out.println("Opening Chrome browser");
                break;
            case "firefox":
                System.out.println("Opening firefox");
                break;
            case "safari":
                System.out.println("Opening safari");
                break;
            case "opera":
                System.out.println("Opening opera");
                break;

            default:
                System.out.println("invalid");


    }

}}
