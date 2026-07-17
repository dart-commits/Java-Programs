import java.util.Scanner;
public class mains{
    public static void main(String[] args){
        //For input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        String str1 = sc.nextLine();
        System.out.print("Enter Second number:");
        String str2 = sc.nextLine();
        //String to wrapper object
        Integer num1 = Integer.valueOf(str1);
        Integer num2 = Integer.valueOf(str2);
        //Wrappr object to Primitive(Unboxing)
        int a = num1;
        int b = num2;
        System.out.println("\nArithmetic Operations");
        System.out.println("Addition");

        System.out.println(a+b);
        System.out.println("Subtraction");
        System.out.println(a-b);
        if(b!=0){
            System.out.println("Division");
            System.out.println(a/b);
        }
        System.out.println("Multiplication");
        System.out.println(a*b);

        //Primitive to Wrapper(Autoboxing)
        int x =100;
        Integer wrapperX=x;
        System.out.println("\n Primitive to wrapper:");
        System.out.println("Primitive value:"+x);
        System.out.println("Wrapper Object:"+wrapperX);
        Integer wrapperY = Integer.valueOf(250);
        int y = wrapperY;
        System.out.println("\nWrapper to Primitive");
        System.out.println("Wrapper Object:"+wrapperY);
        System.out.println("Primitive value:"+y);
        System.out.println();

    }
    
}
