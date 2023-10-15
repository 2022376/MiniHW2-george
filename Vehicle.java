/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */

public abstract class Vehicle implements Drivable {
    private float speed;
    private float direction = 0;
    private String make;
    private String type;
    protected int numWheels = 0;
    protected int numWings = 0;
    protected int numSails = 0;
    private int numPassengers;
    //the constructor is to initialize vehicle attributes
    public Vehicle(String make, String type, int numPassengers) {
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
    }
    //this code is to move the vehicle with a new speed and direction 
    public void move(float newSpeed, float newDirection) {
        speed = newSpeed;
        direction = newDirection;
        System.out.println("Vehicle is moving at speed " + speed + " in direction " + direction + " degrees.");
    }
    // this code is abstract method to start the vehicle 
    public abstract void start();
    
    //this code is to stop the vihicle
    public void stop() {
        speed = 0;
        System.out.println("Vehicle has stopped.");
    }
    
    //this code is to implementing Drivable interface methodo 
    @Override
    public void accelerate(float speed) {
        this.speed += speed;
        System.out.println("Accelerating. Current speed: " + this.speed);
    }

    @Override
    public void brake() {
        this.speed = 0;
        System.out.println("Braking. Vehicle has stopped.");
    }

    @Override
    public void turn(float angle) {
        this.direction += angle;
        System.out.println("Turning. New direction: " + this.direction);
    }

    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
        return type;
    }
}
