/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 24zhendavi
 */
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Contact c1 = new Contact();
        c1.setName("Jake");
        c1.setAge(8);
        c1.setTennisRank(600);
        System.out.print("Name: " + c1.getName() + " ");
        System.out.print("Mental Age: " + c1.getAge() + " ");
        System.out.println("Tennis rank: " + c1.getTennisRank() + " ");
        
        Contact c2 = new Contact();
        c2.setName("Dave");
        c2.setAge(100);
        c2.setTennisRank(1);
        System.out.print("Name: " + c2.getName() + " ");
        System.out.print("Mental Age: " + c2.getAge() + " ");
        System.out.println("Tennis rank: " + c2.getTennisRank() + " ");
        
        Contact c3 = new Contact();
        c3.setName("Mr. Hanley");
        c3.setAge(5);
        c3.setTennisRank(10000000);
        System.out.print("Name: " + c3.getName() + " ");
        System.out.print("Mental Age: " + c3.getAge() + " ");
        System.out.println("Tennis rank: " + c3.getTennisRank());
        
        Contact c4 = new Contact();
        System.out.println("What is your contacts name? ");
        String nme = input.nextLine();
        c4.setName(nme);
        System.out.println("What is your contacts mental age? ");
        int mentalAge = input.nextInt();
        c4.setAge(mentalAge);
        System.out.println("What is your contacts tennis rank? ");
        int tenRank = input.nextInt();
        c4.setTennisRank(tenRank);
        System.out.print("Name: " + c4.getName() + " ");
        System.out.print("Mental Age: " + c4.getAge() + " ");
        System.out.println("Tennis rank: " + c4.getTennisRank());
    }
}
