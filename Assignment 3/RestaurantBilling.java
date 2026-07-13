class Restaurant {

    static int totalOrders = 0;

    // Dine-in bill
    double calculateBill(double foodAmount) {
        totalOrders++;
        return foodAmount;
    }

    // Takeaway bill (includes packing charge)
    double calculateBill(double foodAmount, double packingCharge) {
        totalOrders++;
        return foodAmount + packingCharge;
    }

    // Delivery bill (includes packing and delivery charges)
    double calculateBill(double foodAmount, double packingCharge, double deliveryCharge) {
        totalOrders++;
        return foodAmount + packingCharge + deliveryCharge;
    }

    // Display total orders
    static void displayOrders() {
        System.out.println("Total Orders: " + totalOrders);
    }
}

public class RestaurantBilling {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        System.out.println("Dine-in Bill: ₹" + r.calculateBill(500));

        System.out.println("Takeaway Bill: ₹" + r.calculateBill(500, 30));


        System.out.println("Delivery Bill: ₹" + r.calculateBill(500, 30, 50));

        Restaurant.displayOrders();
    }
}
