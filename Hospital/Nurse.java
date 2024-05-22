package Hospital;

public class Nurse extends Person {
    private String floorNumber;

    public Nurse(String name, int age, String gender, String floorNumber) {
        super(name, age, gender);
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Nurse [floorNumber=" + floorNumber + ", toString()=" + super.toString() + "]";
    }

    void nurseOut() {
        super.personOut();
        System.out.println("Floor Number = " + floorNumber);
    }
}
