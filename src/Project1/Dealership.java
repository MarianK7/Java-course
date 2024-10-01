package Project1;

public class Dealership {

    public static void main(String[] args) {

    Customer cust1 = new Customer("John", "1234", "Rubinova 12, Banska Bystrica, Slovakia", 10000, 0);
    Customer cust2 = new Customer("Jane", "5678", "Hlavna 12, Banska Bystrica, Slovakia", 12000, 5000);
    Customer cust3 = new Customer("Jack", "91011", "Kollarova 12, Banska Bystrica, Slovakia", 100000, 0);

    Vehicle car1 = new Vehicle("Toyota", "Corolla", "BA1234", 2021, 20000, null);
    Vehicle car2 = new Vehicle("Ford", "Focus", "TN5678", 2021, 25000, null);
    Vehicle car3 = new Vehicle("BMW", "X5", "BB91011", 2021, 50000, null);
    Vehicle car4 = new Vehicle("Skoda", "Fabia", "KE121314", 2021, 7200, null);

    Employee emp1 = new Employee("John", "1234", null);
    Employee emp2 = new Employee("Jane", "5678", null);

    cust1.purchaseCar(emp1, car1, false);
    cust2.purchaseCar(emp2, car2, true);
    cust3.purchaseCar(emp1, car3, true);
    cust3.purchaseCar(emp2, car4, false);
    cust3.printInfo();
    }
}
