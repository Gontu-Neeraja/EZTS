package Hospital;

public class Patient extends Person {
    private String disease;
    private int bedNumber;

    public Patient(String name, int age, String gender, String disease, int bedNumber) {
        super(name, age, gender);
        this.disease = disease;
        this.bedNumber = bedNumber;
    }

    @Override
    public String toString() {
        return "Patient [disease=" + disease + ", bedNumber=" + bedNumber + ", toString()=" + super.toString() + "]";
    }

    void patientOut() {
        super.personOut();
        System.out.println("Disease = " + disease);
        System.out.println("Bed Number = " + bedNumber);
    }
}
