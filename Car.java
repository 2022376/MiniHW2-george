/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author georgedias
 */
public class Car extends Vehicle {
    public Car(String make, int numPassengers) {
        super(make, "Car", numPassengers);
        numWheels = 4;
    }
    //this code is to the start methodo for a car
    @Override
    public void start() {
        System.out.println("Starting the car.");
    }
}
