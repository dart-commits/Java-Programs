class Animal{
    void dis(){
        System.out.println("In Animal Class");
    }
}
public class Anoclass {
    public static void main(String[] args){
        Animal a = new Animal(){
            void dis(){
                super.dis();
                System.out.println("Hello from Ano Class");
            }
        };
        a.dis();
    }
    
}
