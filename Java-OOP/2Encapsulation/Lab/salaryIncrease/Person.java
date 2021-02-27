package salaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }


    public void increaseSalary(double bonus){
        if(this.getAge() < 30){
            this.salary += (this.salary * bonus / 200);
        }else {
            this.salary += (this.salary * bonus / 100);
        }
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva",
                this.getFirstName(),this.getLastName(),this.getSalary());
    }
}

