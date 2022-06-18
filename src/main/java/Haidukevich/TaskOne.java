package Haidukevich;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int NumberOne = scanner.nextInt();
        int NumberTwo = scanner.nextInt();
        int SunOfNumbers = NumberOne + NumberTwo;
        System.out.println("Sum of Numbers " + "" +SunOfNumbers + "\t");
        int MultiplicationOfNumbers =NumberOne * NumberTwo;
        System.out.println("Multiplication Of Numbers " + "" +MultiplicationOfNumbers);
    }
}
