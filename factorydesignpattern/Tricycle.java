package factorydesignpattern;

/**
 * Tricyclc class extending Bike class
 * @author Jackson Carroll
 */
public class Tricycle extends Bike {
    
    public Tricycle() {
        name = "Tricycle";
        price = 54.95;
        numWheels = 3;
        hasPeddals = true;
        hasTrainingWheels = false;
    }
}
