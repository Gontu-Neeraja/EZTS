package Hospital;

public class Doctor extends Person {
    private String speciality;

    public Doctor(String name, int age, String gender, String speciality) {
        super(name, age, gender);
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Doctor [speciality=" + speciality + ", toString()=" + super.toString() + "]";
    }

    void doctorOut() {
        super.personOut();
        System.out.println("Speciality = " + speciality);
    }
}
