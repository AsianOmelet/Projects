/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 24zhendavi
 */
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        //this asks the user what the length of the sides of the triangle are
        System.out.println("What is the length of side A?: ");
        a = input.nextInt();
        System.out.println("What is the length of side B?: ");
        b = input.nextInt();
        System.out.println("What is the length of side C?: ");
        c = input.nextInt();
        // this checks for triangle inequality
        if (a >= b + c || b >= a + c || c >= a + b) { 
            System.out.println("This isn't a triangle, try again.");
            System.exit(0);
        }
        //checks for equilateral triangles
        if (a == b && a == c) {
            System.out.println("Equilateral");
        } else if (a == b || b == c || a == c) {
            //checks for isosceles
            System.out.println("Isosceles");
        } else {
            //checks for scalene
            System.out.println("Scalene");
        }
    }
}
