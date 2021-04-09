/*******************************************
 * NewCar.java
 * Jonathan Wheeler
 *
 * Class that extends Car, to implement a
 * new car object
 */
package Assignment4.Project;

public class NewCar extends Car {

    private String color;

    //Constructor
    public NewCar(double cost, String carColor){

        super(cost);
        this.color = carColor;

    }

    //Check to see if both objects are the same
    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;

        if (!(otherObject instanceof NewCar))
            return false;

        NewCar x = (NewCar) otherObject;

        return Double.compare(getPrice(), x.getPrice()) == 0 &&
                color.equalsIgnoreCase(x.color);
    }

    public String toString(){

        String str1 = String.format("Price = $%.2f", getPrice());
        return str1 + ", color = " + color;
    }
}
