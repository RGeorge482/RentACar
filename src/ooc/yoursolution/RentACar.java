/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author 35386
 */
public class RentACar implements RentACarInterface {
    
    private String name;
  
    
   
    private List<CarInterface> cars = new ArrayList<>();

    /**
     * Return the full list of cars.
     *
     * @return	List of cars
     */
    @Override
    public List<CarInterface> getCars() {
         return this.cars;
    }

     /**
     * Helper method to set all the cars with a list if we so wished
     *
     * @param cars	List of cars
     */
    @Override
    public void setCars(List<CarInterface> cars) {
        this.cars = cars;
    }

    
    /**
     * Return the name of the Rent-a-car
     *
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Set the name of the rent-a-car.
     *
     * @param name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    
     /**
     * Check through all cars in this company and see if there is continuous
     * availability of any specific car. It is not enough to just have
     * any car available for the length of stay, we need it to be in one
     * specific make of car.
     *
     * @param month	Month of proposed rent
     * @param day	Day of start of proposed rent
     * @param make	Make, what sort of car for the proposed rent
     * @param lengthOfRent	how long is the proposed rent for
     * 
     * @return	true or false is there availability for the proposed rent
     */
    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
          CarInterface car = new Car();//INSTANTIATION OF CAR SO THAT CARINTERFACE METHODS CAN BE USED HERE

        for (CarInterface carIndex : this.cars) {//FOR EACH LOOP OF CARINTERFACE TYPE UNITL LENGHT OF CARS ARRAYLIST
            if (carIndex.getMake() == make) { // IF ITERATION IS EQUAL TO THE MAKE OF PARAMETER BREAK LOOP
                car = carIndex;//ADD TO OBJECT CAR AND BREAK LOOP
                break;
            }
        }

        boolean[] daysOfStay = car.getAvailability().get(month);
        //TAKING CAR AVAILABILITY AND THOWING INSIDE DAYSOFSTAY VALUE OF RETURN IS BOOLEAN

        for (int i = day; i < lengthOfRent; i++) {//IF NOT DAYS ENOUGH AVAILABLE RETURN FALSE
            if (daysOfStay[i] == false) {
                return false;
            }
        }
        return true; // ELSE TRUE
    }

       /**
     * Assuming there is availability, get the id of a car that fits that
     * availability
     *
     * @param month	Month of proposed rent
     * @param day	Day of start of proposed rent
     * @param make	Make, what sort of car for the proposed rent
     * @param lengthOfRent	how long is the proposed rent for
     * @return	the id of a car that fits the bill
     */
    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
         CarInterface car = new Car(); //INSTANTIATION OF CAR SO THAT CARINTERFACE METHODS CAN BE USED HERE

        for (CarInterface carIndex : this.cars) {
            if (carIndex.getMake() == make) {//ACCESSING METHOD GET MAKE FROM CAR INTERFACE
                car = carIndex;
                break;
            }
        }

        return car.getId();
    }

       /**
     * Book a car for the proposed rental period. It should be one car for the full
     * time. THERE IS NO NEED TO CONSIDER RENTALS THAT ROLL OVER TWO MONTHS
     *
     * @param month	Month of proposed rent
     * @param day	Day of start of proposed rent
     * @param make	Make, what sort of car for the proposed rent
     * @param lengthOfRent	how long is the proposed rent for
     * @return	true or false has the room been booked
     */
    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        
    }

    /**
     * How many cars are in the rent-a-car
     *
     * @return number of cars
     */
    @Override
    public int getNumberOfCars() {
          int total = 0;

        // iterate each item in the car list and update the count
        for (CarInterface car : this.cars) {
            total += ((Car) car).getCount();
        }
        return total;
    }
    
}
