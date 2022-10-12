/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package castle_stairs;

import java.util.Scanner;

public class Castle_Stairs {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //collecting stair height
        System.out.println("What is the length of your stairs?");
        int leng = input.nextInt();
        //primary for loop, every iteration of i counts as one row 
        for (int i = 1; i <= leng; i++) {
            int stairs = i;
            int space = leng - i;
            System.out.println("");
            //creates amount of space needed for 
            for (int j = 0; j < space; j++) {
                System.out.print("    ");
            }
            for (int p = 0; p < stairs; p++) {
                System.out.print("+---");
            }
            System.out.print("+");
            System.out.println("");
            //creates necessary space to have evenly spaced stairs 
            for (int k = 0; k < space; k++) {
                System.out.print("    ");
            }
            for (int n = 0; n < stairs; n++) {
                System.out.print("|   ");
            }
            System.out.print("|");
        }
        //creates the foundation row of stairs 
        System.out.println("");
        for (int j = 0; j < leng; j++) {
            System.out.print("+---");
        }
        System.out.print("+");
    }
}
