package day29_methods;

public class methods {
    public static void main(String[] args) {
        calculator(100, '*',50);
    }

    public static void calculator (double num1, char operator,double num2){
        switch (operator) {
            case '+':
                System.out.println("Addition" + (num1 + num2));
                break;
            case '-':
                System.out.println("subtraction " + (num1 - num2));
                break;
            case '*':
                System.out.println("multiplication " + (num1 * num2));
                break;
            case '/':
                System.out.println("division" + (num1 / num2));
                break;
            case '%':
                System.out.println("remainder" + (num1 % num2));
                break;
            default:
                System.out.println("invalid");
        }



        }
    }




