package Hospital;

public class Main {

    public static void main(String[] args) {
        
        Person person = new Person("Prakash", 30, "Male");
        System.out.println(person.toString());
        person.personOut();
        
        Doctor doctor = new Doctor("Dr. Sumithra", 45, "Female", "Cardiology");
        System.out.println(doctor.toString());
        doctor.doctorOut();
        
        Patient patient = new Patient("Jahnavi", 28, "Female", "Flu", 101);
        System.out.println(patient.toString());
        patient.patientOut();
        
        Nurse nurse = new Nurse("Niveditha", 35, "Female", "Floor 2");
        System.out.println(nurse.toString());
        nurse.nurseOut();
    }
}
