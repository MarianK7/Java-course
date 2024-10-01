package Project1;

public class Employee {

   private String Name;
   private String ID;
   private String [] soldCars;

   public static void processTransaction(Customer cust, Vehicle vehicle) {
//        cust.setBoughtCars(new String[]{vehicle.getLicensePlate()});
        cust.setCashOnHands(cust.getCashOnHands() - vehicle.getPrice());
        vehicle.setOwner(cust);
        System.out.println("Customer has purchased the vehicle: " + vehicle.getMake() + " " + vehicle.getModel() + " for the price " + vehicle.getPrice());
    }

    public static void runCreditHistory(Customer cust, Vehicle vehicle, double loanAmount) {
        System.out.println("Ran credit history for Customer...");
        if (cust.getLoanAmount() > 0) {
            System.out.println("Customer " + cust.getID() + " has been denied to purchase the vehicle.");
        } else {
            System.out.println("Customer " + cust.getID() + " has been approved to purchase the vehicle.");
            cust.setLoanAmount(loanAmount);
            cust.setCashOnHands(cust.getCashOnHands() + loanAmount);
            processTransaction(cust, vehicle);
        }
     }

    public static void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
        if (finance) {
            double loanAmount = vehicle.getPrice() - cust.getCashOnHands();
            if (loanAmount <= 0) runCreditHistory(cust, vehicle, vehicle.getPrice());
            else runCreditHistory(cust, vehicle, loanAmount);
        } else if (vehicle.getPrice() <= cust.getCashOnHands()) {
            processTransaction(cust, vehicle);
        } else {
            System.out.println("Customer " + cust.getID() + " will need more money to purchase vehicle: " + vehicle.getMake() + " " + vehicle.getModel());
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String[] getSoldCars() {
        return soldCars;
    }

    public void setSoldCars(String[] soldCars) {
        this.soldCars = soldCars;
    }

    public Employee(String name, String ID, String[] soldCars) {
        Name = name;
        this.ID = ID;
        this.soldCars = soldCars;
    }
}
