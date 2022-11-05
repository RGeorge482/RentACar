/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.ArrayList;
import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author 35386
 */
public class RentACar implements RentACarInterface {
    
    private String name;
  
    
    ArrayList<Car> car = new ArrayList<>();

    /**
     * Return the full list of cars.
     *
     * @return	List of cars
     */
    @Override
    public List<CarInterface> getCars() {
        ArrayList<CarInterface> carList = new ArrayList<>();
        
         for(Car c : car) {
            carList.add(c);
        }
         return carList;
    }

     /**
     * Helper method to set all the cars with a list if we so wished
     *
     * @param cars	List of cars
     */
    @Override
    public void setCars(List<CarInterface> cars) {
         ArrayList<CarInterface> myCarList = new ArrayList<>();
         for(CarInterface c : cars){            
             myCarList.addAll(cars);
         }
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
        
    }
    
}
