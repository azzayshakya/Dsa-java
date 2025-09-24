abstract class animal{
    abstract void bark();
    abstract void run();
}
class dog extends animal{
    @Override
    void bark() {

        System.out.println("barking");
    }
    void run(){
        System.out.println("running");
    }
}

public class Oops_Abstract {
    public static void main(String [] args){
        System.out.println("ajay");
        animal a1=new dog();
        a1.bark();
a1.run();
    }
}
