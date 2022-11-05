/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.HashMap;
import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author 35386
 */
public class Car implements CarInterface {

    private Make make;
    private double rate;
    private int id;
    private int carQuantity;
     private Map<Month, boolean[]> availability;//MAP HAS KEY MONTH AND VALUE BOOLEAN
    
    
    Map<Month, boolean[]> calendar;
    
     /**
     * This method is in charge of creating the calendar of availability 
     * of the car for the whole year. 
     * The calendar should be a Map that uses the Month as the key, 
     * and an array of boolean as its associated value.
     * 
     * @return Map of availability
     */
    @Override
    public Map<Month, boolean[]> createAvailability() {
        this.availability = new HashMap<>();// instantiating a hashmap

        for (Month month : Month.values()) {//FOR EACH USING MONTH AS A TYPE AND VALUES OF MONTH AS PAR
            boolean[] days = new boolean[month.getNumberOfDays()];//DAYS ARE AN ARRAY O BOOLEANS WITH NUMBER OF DAYS PARAMETER

            int index = 0;

            while (index < days.length) {
                days = true;
                //ATTEMPTING TO ASSIGNE TRUE TO ALL DAYS BOOLEAN VALUES
            }
            
        }
        return this.availability;
    }
    
    
    

    /**
     * Getter method for the make of this car.
     * 
     * @return the make of the car
     */
    @Override
    public Make getMake() {
        return this.make;
    }

     /**
     * Sets the make of the car.
     * 
     * @param make 
     */
    @Override
    public void setMake(Make make) {
         this.make = make;   
    }

     /**
     * Getter method for the rate of this car.
     * 
     * @return rate of the car.
     */
    @Override
    public double getRate() {
        return this.rate;
    }

     /**
     * Sets the rate of the car.
     * 
     * @param rate 
     */
    @Override
    public void setRate(double rate) {
        this.rate = rate;
    }

     /**
     * Getter method for the availability calendar of this car.
     * 
     * @return Map of availability
     */
    @Override
    public Map<Month, boolean[]> getAvailability() {
        return this.availability;
    }

    /**
     * Sets the availability calendar of the car.
     * 
     * @param availability 
     */
    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        this.calendar = availability;
    }

    /**
     * Getter method for the id of this car.
     * 
     * @return 
     */
    @Override
    public int getId() {
        return this.id;
    }

    
     /**
     * Returns whether or not the car is available on the given month and day. 
     * Month is an Emum, day is an int within the limits of the number of days
     * in a given month
     * 
     * @param month Month being checked
     * @param day day being checked
     * @return  true or false if it is available or not
     */
    @Override
    public boolean isAvailable(Month month, int day) {
        return this.availability.get(month) && day; //ATTEMPTING OF RETURNING MONTH AND DAY VALUE
    }

     /**
     * Book a car on the given month and day. To book a car its availability 
     * is changed to false on the given month and day. 
     * This should return true or false if this change is successfully made.
     * 
     * @param month month to book
     * @param day date to book
     * @return true or false if the booking is completed
     */
    @Override
    public boolean book(Month month, int day) {
         int a;
         return true;
    }
    
}
