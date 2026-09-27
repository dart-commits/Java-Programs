class Calculator {

    static int count = 0;

    // Overloaded method for integer addition
    int add(int a, int b) {
        count++;
        return a + b;
    }

    // Overloaded method for decimal addition
    double add(double a, double b) {
        count++;
        return a + b;
    }

    // Method to display calculation count
    static void displayCount() {
        System.out.println("Total Calculations Performed: " + count);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();


        int intResult = calc.add(15, 25);
        System.out.println("Integer Addition: " + intResult);

        double doubleResult = calc.add(10.5, 20.3);
        System.out.println("Decimal Addition: " + doubleResult);

        Calculator.displayCount();
    }
}
