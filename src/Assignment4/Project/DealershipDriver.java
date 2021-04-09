/*******************************************************
 * DealshipDriver.java
 * Jonathan Wheeler
 *
 * Provided by Professor
 */
package Assignment4.Project;

public class DealershipDriver {

    public static void main(String[] args)
    {
        NewCar new1 = new NewCar(8000.33, "silver");
        NewCar new2 = new NewCar(8000.33, "silver");
        if (new1.equals(new2))
        {
            System.out.println("New Car 1: " + new1);
        }

        UsedCar used1 = new UsedCar(2500, 100000);
        UsedCar used2 = new UsedCar(2500, 100000);
        if (used1.equals(used2))
        {
            System.out.println("Used Car 1: " + used1);
        }

        System.out.println("Used car equals to new car: " + used1.equals(new1));
    } // end main
}
