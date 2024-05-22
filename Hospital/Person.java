package Hospital;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }

    void personOut() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
    }
}
