package factorydesignpattern;

/**
 * Class for Bike with bike characteristics 
 * @author Jackson Carroll
 */
public abstract class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPeddals;
    protected boolean hasTrainingWheels;

    /**
     * Create Bike method that creates the bike with its characteristics
     */
    public void createBike() {
        createFrame();
        addWheels();
        addPedals();
        getPrice();
    }

    /**
     * Displays the bike frame that is being created
     */
    private void createFrame() {
        System.out.println("Assembling " + this.name + " frame");
    }

    /**
     * Displays the number of wheels being added
     * Also displays training wheels if the bike has training wheels
     */
    private void addWheels() {

        if(numWheels > 0) {
            System.out.println("Adding " + this.numWheels + " wheel(s)");
        }
        
        if(hasTrainingWheels) {
            System.out.println("Adding training wheels");
        }
    }

    /**
     * Displays the addition of pedals to the bike if the bike has pedals
     */
    private void addPedals() {
        
        if(hasPeddals) {
            System.out.println("Adding pedals");
        }
    }

    /**
     * Displays the price of the bike
     */
    public void getPrice() {
        System.out.println("Price: $" + this.price);
    }
}
