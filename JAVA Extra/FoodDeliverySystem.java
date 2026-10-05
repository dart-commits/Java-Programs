interface DeliveryStatus {
    void updateStatus(String status);
}

class Order {
    private int orderId;
    private String customerName;
    private double amount;

    Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    class OrderDetails {
        void display() {
            System.out.println("Order ID: " + orderId);
            System.out.println("Customer Name: " + customerName);
            System.out.println("Amount: " + amount);
        }
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {

        Order order = new Order(101, "Akshit", 499.50);

        Order.OrderDetails details = order.new OrderDetails();

        System.out.println("Order Details");
        details.display();

        System.out.println();

        DeliveryStatus status = new DeliveryStatus() {
            @Override
            public void updateStatus(String status) {
                switch (status) {
                    case "ORDER_PLACED":
                        System.out.println("Order placed successfully.");
                        break;

                    case "PREPARING":
                        System.out.println("Your order is being prepared.");
                        break;

                    case "OUT_FOR_DELIVERY":
                        System.out.println("Your order is out for delivery.");
                        break;

                    case "DELIVERED":
                        System.out.println("Your order has been delivered.");
                        break;

                    default:
                        System.out.println("Invalid delivery status.");
                }
            }
        };

        System.out.println("Delivery Status");

        status.updateStatus("ORDER_PLACED");
        status.updateStatus("PREPARING");
        status.updateStatus("OUT_FOR_DELIVERY");
        status.updateStatus("DELIVERED");
    }
}