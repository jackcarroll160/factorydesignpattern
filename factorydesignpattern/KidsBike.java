package factorydesignpattern;

/**
 * Kids Bike class extending Bike class
 * @author Jackson Carroll
 */
public class KidsBike extends Bike {

    /**
     * Default Constructor for Kids Bike class setting default values
     */
    public KidsBike() {
        name = "Kids Bike";
        price = 80.99;
        numWheels = 2;
        hasPeddals = true;
        hasTrainingWheels = true;
    }
}
