/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;


public class Crapz {
    public static void main(String[] args) {
        
        // sets activate to true and enables a while true loop
        int activate = 1;
        //sets number of chips
        int chips = 100;
        // while true loop 
        Random dice = new Random(4);
        while (activate == 1) {
            //initializs the diceTotal
            int diceTotal = 0;
            //initializes the dice ints
            int dice1;
            int dice2;
        //enables a new random named dice
           
            Scanner input = new Scanner(System.in);
            //if you have zero chips then you lose and the game turns off
            if (chips <= 0) {
                System.out.println("Game over!");
                break;
            }
            // asks user for bet amount
            System.out.println("You have " + chips + " chips. How many do you want do bet?");
            int bet = input.nextInt();
            //give the money away
            chips = chips - bet;
            System.out.println("Press r to roll");
            char reRoll = input.next().charAt(0); //looks for user input of char r
            if (reRoll == 'r') {
                //initializes two dice
                dice1 = dice.nextInt(6) + 1;
                dice2 = dice.nextInt(6) + 1;
                diceTotal = dice1 + dice2;
            }
            //allows for the firstroll loop 
            boolean firstRoll = true;
            //prints the first dice roll
            System.out.println(diceTotal);

            if (firstRoll == true) {
                if (diceTotal == 7 || diceTotal == 11) { //win on 7 or 11 on first roll
                    System.out.println("You win!");
                    chips = chips + 2 * bet; //win amount
                } else if (diceTotal == 2 || diceTotal == 3 || diceTotal == 12) { //lose on 2, 3, or 12 on first roll
                    System.out.println("You lost!");
                } else {
                    int point = diceTotal; //sets the point to the first dicetotal
                    boolean rollPhase = true;
                    while (rollPhase == true) { //while true statement
                        firstRoll = false; //sets first roll to false so that it doesn't set another point 
                        System.out.println("Press r to roll");
                        reRoll = input.next().charAt(0);
                        if (reRoll == 'r') { //reroll function
                            dice1 = dice.nextInt(6) + 1;
                            dice2 = dice.nextInt(6) + 1;
                            diceTotal = dice1 + dice2;
                        }
                        System.out.println(diceTotal);
                        if (diceTotal == point) { //if latest dicetotal equals first dicetotal set in first roll phase you win 
                            System.out.println("You win!");
                            chips = chips + 2 * bet;
                            break;
                        } else if (diceTotal == 7) { //if you roll seven after first roll, you lose
                            System.out.println("You lose!");
                            break;
                        }
                    }
                }
            }
        }
    }
}