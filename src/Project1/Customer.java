package Project1;

import java.util.List;

public class Customer {

    private String name;
    private String ID;
    private List<String> boughtCars;;
    private String address;
    private double cashOnHands;
    private double loanAmount = 0;

    public void purchaseCar(Employee emp, Vehicle car, boolean finance) {
        emp.handleCustomer(this, finance, car);
    }

    public void printInfo() {
        System.out.println("Customer: " + this.getName() + " ID: " + this.getID() + " Address: " + this.getAddress() + " Cash on hands: " + this.getCashOnHands() + " Loan amount: " + this.getLoanAmount());
        System.out.println("Bought cars: " + this.getBoughtCars());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<String> getBoughtCars() {
        return boughtCars;
    }

    public void setBoughtCars(List<String> boughtCars) {
        this.boughtCars = boughtCars;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHands() {
        return cashOnHands;
    }

    public void setCashOnHands(double cashOnHands) {
        this.cashOnHands = cashOnHands;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Customer(String name, String ID, String address, double cashOnHands, double loanAmount) {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.cashOnHands = cashOnHands;
        this.loanAmount = loanAmount;
    }
}
