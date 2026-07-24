class Outer{
    private String message = "Hello From Outer Class";


class Inner{
    void display(){
        System.out.println("Message: "+ message);
    }
}
}
//Normal Class
class Animal{
    private String message1 = "Animal makes a sound";
    class Dog{
        void show(){
            System.out.println("Dog barks "+ message1);
        }
    }
}
public class Inneranonymousdemo{
    public static void main(String[] args){
        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner();
        in.display();
        //Demonstrating Anonymous Class
        Animal a = new Animal();
        Animal.Dog d = a.new Dog();
        d.show();
        
    }

}