package dayTwo;

import java.time.LocalDate;

/**
 * Created by student on 23-Aug-16.
 */
//employee is a person
public class Employee extends Person{
    private String position;
    private LocalDate hireDate;

    Employee() {}

    public Employee(String firstName, String lastName, short height, double weight, LocalDate birthDate, SexType sex,
                     LocalDate hireDate, String position) {
        super(firstName, lastName, height, weight, birthDate, sex);
        this.hireDate = hireDate;
        this.position = position;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
        public String toString() {
            return String.format("Employee Name: %s %s %s", super.toString(), this.position, this.hireDate);
        }
    }

