/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 24zhendavi
 */
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your test number? ");
        int num = input.nextInt();
        int sum = divisorSum(num);
        if (sum == num) {
            System.out.println("You have a perfect number. ");
        } else if (sum > num) {
            System.out.println("You have an abundant number ");
        } else {
            System.out.println("You have a deficient number");
        }
    }

    public static boolean isDivisor(int num, int Divisor) {
        return num % Divisor == 0;
    }

    public static int divisorSum(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (isDivisor(number, i)) {
                sum += i;
            }
        }
        return sum;
    }
}
