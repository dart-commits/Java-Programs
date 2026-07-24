class Vehicle {

    String brand = "Toyota";
    String model = "Fortuner";


    class Details {
        void display() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
        }
    }

    void action() {
        System.out.println("Vehicle is moving...");
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle();


        Vehicle.Details d = v.new Details();
        d.display();


        Vehicle obj = new Vehicle() {
            void action() {
                System.out.println("Vehicle is starting...");
            }
        };

        obj.action();
    }
}