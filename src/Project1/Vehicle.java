package Project1;

public class Vehicle {

    private String make;
    private String model;
    private String licensePlate;
    private int year;
    private int price;
    private Customer owner;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Vehicle(String make, String model, String licensePlate, int year, int price, Customer owner) {
        this.make = make;
        this.model = model;
        this.licensePlate = licensePlate;
        this.year = year;
        this.price = price;
        this.owner = owner;
    }
}
