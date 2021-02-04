package factorydesignpattern;

/**
 * Class for BikeStore to order and create a bike
 * @author Jackson Carroll
 */
public class BikeStore {

    /**
     * Orders a type of bike then creates the ordered bike
     * @param type A String for the type of bike
     * @return the bike
     */
    public Bike orderBike(String type) {
        Bike bike = createBike(type);

        bike.createBike();

        return bike;
    }

    /**
     * Creates a new bike
     * @param type A String for the type of bike
     * @return the bike
     */
    private Bike createBike(String type) {
        Bike bike = null;

        if(type.equalsIgnoreCase("Tricycle")) {
            bike = new Tricycle();
        }
        else if(type.equalsIgnoreCase("Strider")) {
            bike = new Strider();
        }
        else if(type.equalsIgnoreCase("Kids Bike")) {
            bike = new KidsBike();
        }
        else {
            throw new NullPointerException("Parameter Type cannot be null");
        }

        return bike;
    }
    
}
