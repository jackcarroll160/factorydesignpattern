package factorydesignpattern;

/**
 * Tricycle class extending Bike class
 * @author Jackson Carroll
 */
public class Tricycle extends Bike {
    
    /**
     * Default Constructor for Tricycle class setting default values
     */
    public Tricycle() {
        name = "Tricycle";
        price = 54.95;
        numWheels = 3;
        hasPeddals = true;
        hasTrainingWheels = false;
    }
}
