public class Stud {
    public static void main(String[] args) {

        class Student {
            String name;
            int age;
            float height;
            float weight;
            int rollno;
            int x = 5;
            int y = 5;

            // Default Constructor
            Student() {
                name = "Default Name";
                rollno = 0;
                age = 18;
                height = 0.0f;
                weight = 0.0f;
            }

            // Parameterized Constructor
            Student(String n, int r, int a, float h, float w) {
                name = n;
                rollno = r;
                age = a;
                height = h;
                weight = w;
            }

            void display() {
                System.out.println("Name: " + name);
                System.out.println("Roll No: " + rollno);
                System.out.println("Age: " + age);
                System.out.println("Height: " + height);
                System.out.println("Weight: " + weight);
                System.out.println(x == y);
            }
        }

        // Object using Default Constructor
        Student s1 = new Student();

        // Object using Parameterized Constructor
        Student s2 = new Student("Akshit Kumar", 270, 18, 6.0f, 78.6f);

        System.out.println("Default Student:");
        s1.display();

        System.out.println("\nParameterized Student:");
        s2.display();
    }
}
