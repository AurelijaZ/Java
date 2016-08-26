package dayTwo;

import java.time.LocalDate;

/**
 * Created by student on 23-Aug-16.
 */
//employee is a person (extends)
    //we need to extend information of the employee, we already have info from the person and in this class
    //we have extra features added only for employee purpose.
public class Employee extends Person{
    private String position;
    private LocalDate hireDate;

    Employee() {}

    public Employee(String firstName, String lastName, short height, double weight, LocalDate birthDate, SexType sex,
                    String position, LocalDate hireDate) {
        //super is a way to call out previous class information.
        super(firstName, lastName, height, weight, birthDate, sex);
        //getter and setter
        this.hireDate = hireDate;
        this.position = position;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public String getPosition() {
        return position;
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

