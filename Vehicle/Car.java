package Vehicle;

public class Car extends Master {

    private String fuelType;

    public Car(int model, int engine, String color, String fuelType) {
        super(model, engine, color);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car [fuelType=" + fuelType + ", toString()=" + super.toString() + "]";
    }
    
    void carOut() {
        super.Masterout();
        System.out.println("Fuel Type = " + fuelType);
    }
}
