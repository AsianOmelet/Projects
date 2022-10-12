/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Cal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many days are in the month? ");
        int days = input.nextInt();
        System.out.println("What was the first day in the month? (-1 to quit, 0 for Monday, 1 for Tuesday, etc) ");
        int firstDay = input.nextInt();
        System.out.println("M\tT\tW\tTH\tF\tS\tSU\t");
        while (true) {
            if (firstDay == -1) {
                System.exit(0);
            }
            for (int i = 0; i < firstDay; i++) {
                System.out.print("\t");
                for (int j = 0; j < firstDay; j++) {
                    int dayOut = 0;
                    dayOut += 1;
                    System.out.print(dayOut);
                    for (int k = 0; k < j; k++) {
                        System.out.print("\t");
                    }
                    if ()
                }
                System.out.println("");
            }
        }
    }
}
