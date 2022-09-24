
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 24zhendavi
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //this chunk asks for user input on height, bounciness, and bounces. Also declares the total
        //variable for total distance traveled. 
        double total = 0;
        System.out.println("Initial Height ");
        double height = in.nextDouble();
        System.out.println("Amount of bounciness: .1 - .9");
        double bounciness = in.nextDouble();
        System.out.println("Number of bounces ");
        int bounces = in.nextInt();
        System.out.println("Down " + height);
        //adds initial height to distance traveled
        total += height;
        //calculates the next height for the up distance
        height = height * bounciness;
        System.out.println("Up " + height);
        //adds up distance
        total += height;
        //for loop so that the loop only interates as many times as bounces
        for (int i = 0; i < bounces - 1; i++) {
            //adds the height of the up bounce when it reads the loop again
            total += height;
            System.out.println("Down " + height);
            //more logic to determine bounciness
            height = height * bounciness;
            total += height;
            System.out.println("Up " + height);
            //breaks loop so that if the number is incredibly small, the ball doesn't end up bouncing infinite
            //times
            if (height < .001) {
                break;
            }
        }
        //prints out total distance traveled
        System.out.println(total);
    }
}
