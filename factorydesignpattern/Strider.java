package factorydesignpattern;

/**
 * Strider class extending Bike class
 * @author Jackson Carroll
 */
public class Strider extends Bike {
    
    /**
     * Default Constructor for Strider class setting default values
     */
    public Strider() {
        name = "Strider";
        price = 65.99;
        numWheels = 2;
        hasPeddals = false;
        hasTrainingWheels = false;
    }
}
