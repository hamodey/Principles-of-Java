/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.Scanner;

/**
 *
 * @author Ahmed
 */
public class Classes {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user_input = new Scanner(System.in);
        System.out.println("Make: ");
        String userMake = user_input.next();
        System.out.println("Seats: ");
        int userSeats = user_input.nextInt();

        System.out.println("Fuel: ");
        String userFuel = user_input.next();
//        System.out.println(userMake + " " + userSeats + " " + userFuel);
        Car car1 = new Car(userMake, userSeats, userFuel);
        
        System.out.println(car1.printDetails());
    }
}

class Car {
    private String make;
    private int noOfPass;
    private String typeOfFuel;
    
    int returnOfPass(){
        return noOfPass;
    }
    void changeNoOfPass(int newNoOfPass){
        noOfPass = newNoOfPass;
    }
    void returnTheMake(String newOne){
        make = newOne;
    }
    String printDetails(){
        return make + " " + noOfPass + " " + typeOfFuel;
    }
    Car(String model, int NoOfSeats, String FuelType){
        make = model;
        noOfPass = NoOfSeats;
        typeOfFuel = FuelType;
    }
}
