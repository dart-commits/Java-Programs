class FoodDelivery {

    String food = "Pizza";
    int quantity = 2;


    class OrderDetails {
        void display() {
            System.out.println("Food: " + food);
            System.out.println("Quantity: " + quantity);
        }
    }

    void status() {
        System.out.println("Order is being prepared...");
    }

    public static void main(String[] args) {

        FoodDelivery f = new FoodDelivery();

        FoodDelivery.OrderDetails o = f.new OrderDetails();
        o.display();

        FoodDelivery d = new FoodDelivery() {
            void status() {
                System.out.println("Order has been delivered.");
            }
        };

        d.status();
    }
}