class Mobile {
    String brand;
    String model;
    double price;
    int quantity;


    Mobile() {
        brand = "Unknown";
        model = "Unknown";
        price = 0.0;
        quantity = 0;
    }


    Mobile(String brand, String model, double price, int quantity) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }


    Mobile(Mobile m) {
        this.brand = m.brand;
        this.model = m.model;
        this.price = m.price;
        this.quantity = m.quantity;
    }


    void display() {
        System.out.println("Brand    : " + brand);
        System.out.println("Model    : " + model);
        System.out.println("Price    : ₹" + price);
        System.out.println("Quantity : " + quantity);
    }
}

public class MobileInventory {
    public static void main(String[] args) {

        // Object using Default Constructor
        Mobile m1 = new Mobile();

        // Object using Parameterized Constructor
        Mobile m2 = new Mobile("Samsung", "Galaxy S24", 79999, 15);

        // Duplicate object using Copy Constructor
        Mobile m3 = new Mobile(m2);

        System.out.println("Mobile 1 (Default Constructor)");
        m1.display();

        System.out.println("Mobile 2 (Parameterized Constructor)");
        m2.display();

        System.out.println("Mobile 3 (Copy Constructor - Duplicate Record)");
        m3.display();
    }
}
