/**********************************************
 * UsedCar.java
 * Jonathan Wheeler
 *
 * Class that extends Car to implement a
 * used car object that is different than a
 * new car.
 */
package Assignment4.Project;


public class UsedCar extends Car{

    private int mileage;

    //Constructor
    public UsedCar(double cost, int miles){
        super(cost);
        this.mileage = miles;
    }

    //Compare the objects to see if they are the same
    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;

        if (!(otherObject instanceof UsedCar))
            return false;

        UsedCar x = (UsedCar) otherObject;

        return Double.compare(getPrice(), x.getPrice()) == 0 &&
                Integer.compare(mileage, x.mileage) == 0;
    }

    public String toString() {

        String str1 = String.format("Price = $%.2f", getPrice());
        return str1 + ", mileage = " + mileage;

    }


}
