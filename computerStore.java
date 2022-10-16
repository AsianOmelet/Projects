/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class computerStore {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //asking for user inputs
        System.out.println("Enter cost of your computer: ");
        double cost = input.nextInt();
        //cost cannot be 0 or below zero and cannot be more than $12,000
        if ((cost > 12000) || (cost <= 0)) {
            System.out.println("Error");
            System.exit(0);
        }

        System.out.println("Enter in annual rate of interest: ");
        double interest = input.nextInt();
        //interest cannot be/be below 0% or above 20%
        if ((interest > 20) || (interest <= 0)) {
            System.out.println("Error");
            System.exit(0);
        }
        //divides annualInterest into monthly interest and then gets actual interest percentange by dividing that by 100
        double actInterest = (interest / 12) / 100;
        
        System.out.println("Enter in down payment percent: ");
        double downPayRate = input.nextInt();
        //down payment percentage cannot be above 50 or below 0
        if ((downPayRate > 50) || (downPayRate < 0)) {
            System.out.println("Error");
            System.exit(0);
        }
        //divides the down payment rate to get a percentage and then multiplies that by the cost to find amount of down payment
        double downPay = (downPayRate / 100) * cost;
        
        System.out.println("Down Payment = " + downPay);
        System.out.format("%-20s%10s%15s%15s%15s%15s", "Month", "Balance Srt", "Principle", "Interest", "Payment", "Balance End");
        System.out.println("");
        //initializes month counter
        int month = 0;
        //this allows for the 1st months balance start to be the amount after the down payment was subtracted from cost
        double balStart = cost - downPay;
        //this is used to calculate payment for each month because balStart has a changing value
        double ogBal = balStart;
        //initializes total interest variable
        double totalInterest = 0;
        
        //loop only runs while the starting balance is above zero
        while (balStart > 0) {
            //payment is equal to 5 percent of the original balance, or the balance at month 1
            double pay = 0.05 * ogBal;
            //monthly interest is equal to the monthly percentage times the starting balance of that month
            double monthInterest = actInterest * balStart;
            //principle is the payment of that month minus the interest paid for that month
            double principle = pay - monthInterest;
            //end balance is equal to the starting balance minus principle
            double balEnd = balStart - principle;
            //increments the month and adds interest paid to total interest
            month++;
            totalInterest += monthInterest;
            //makes it so that you dont have to pay more than is actually due
             if (pay >= balStart) {
                principle = balStart;
                monthInterest = actInterest * balStart;
                balEnd = 0;
                pay = principle + monthInterest;
            }

            System.out.format("%-20d%10.2f%15.2f%15.2f%15.2f%15.2f", month, balStart, principle, monthInterest, pay, balEnd);
            System.out.println("");
            //this allows for the interest calculation of every month to change
            balStart = balEnd;
        }
        totalInterest = Math.round(totalInterest * 100.0) / 100.0;
        System.out.println("Total Interest Paid: " + totalInterest);
    }
}
