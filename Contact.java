/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 24zhendavi
 */
public class Contact {

    private String name;
    private int age;
    private int tennisRank;

    public Contact() {
        age = 0;
        name = "";
        tennisRank = 0;
    }
    
     // @param nm */
    public void setName(String nm) {
        name = nm;
    }
    public String getName() {
        return name;
    }
    
    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }
    public void setTennisRank(int rank) {
        tennisRank = rank;
    }
    public int getTennisRank() {
        return tennisRank;
    }
}
