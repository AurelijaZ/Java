package ComputerShop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 26-Aug-16.
 */
public class Customer extends Person {

    private String customerId;
    private String address;
    private String phoneNum;
    private double creditCard;
    List<Computer> computers = new ArrayList<>();




    public Customer(String firstName, String lastName, String customerId, String address, String phoneNum,
                    double creditCard, Computer computer) {

        super(firstName, lastName);
        this.customerId = customerId;
        this.address = address;
        this.phoneNum = phoneNum;
        this.creditCard = creditCard;
        computers.add(computer);

    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(double creditCard) {
        this.creditCard = creditCard;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }


    @Override
    public String toString() {
        return String.format("Person: %s %s %s%s ",
                super.toString(), this.customerId, this.address, this.phoneNum, this.creditCard);
    }
}
