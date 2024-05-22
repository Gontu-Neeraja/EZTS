package Vehicle;

public class Bus extends Master {

    private int numberOfPassengers;

    public Bus(int model, int engine, String color, int numberOfPassengers) {
        super(model, engine, color);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Bus [numberOfPassengers=" + numberOfPassengers + ", toString()=" + super.toString() + "]";
    }
    
    void busOut() {
        super.Masterout();
        System.out.println("Number of Passengers = " + numberOfPassengers);
    }
}
