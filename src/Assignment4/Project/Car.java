/***********************************************
 * Car.java
 * Jonathan Wheeler
 *
 * Class to implement a very basic car
 */
package Assignment4.Project;

public class Car {

    private double price;

    //public Car() {} //Default constructor

    //Mutator method to set the price of the car
    public Car(double cost) {
        this.price = cost * 2;
    }

    //accessor method to get the price of the car
    public double getPrice() { return this.price; }
}
