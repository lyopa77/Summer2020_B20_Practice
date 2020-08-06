package day12_switch;

import java.util.Scanner;

public class userInputPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yor salary ");
        double salary = input.nextDouble();
        System.out.println("How many hours a week do you work?");
int weeklyHour = input.nextInt();

int totalHours = weeklyHour * 52;

double hourlyRate = salary/totalHours;

        System.out.println("Your hourly rate is $"+ hourlyRate + " per hour.");


    }

}
