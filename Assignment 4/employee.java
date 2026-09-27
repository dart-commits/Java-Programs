
import java.util.Scanner;

public class employee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept employee details
            System.out.print("Enter Employee ID: ");
            Integer empId = Integer.valueOf(sc.nextLine());

            System.out.print("Enter Basic Salary: ");
            Double basicSalary = Double.valueOf(sc.nextLine());

            System.out.print("Enter Bonus Amount: ");
            Double bonus = Double.valueOf(sc.nextLine());

            // Validation
            if (basicSalary <= 0) {
                System.out.println("Error: Basic salary must be greater than 0.");
                return;
            }

            if (bonus < 0) {
                System.out.println("Error: Bonus cannot be negative.");
                return;
            }

            // Calculate net salary
            Double netSalary = basicSalary + bonus;

            // Display details
            System.out.println("\n----- Employee Payroll Details -----");
            System.out.println("Employee ID : " + empId);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("Bonus       : " + bonus);
            System.out.println("Net Salary  : " + netSalary);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } finally {
            sc.close();
        }
    }

}
