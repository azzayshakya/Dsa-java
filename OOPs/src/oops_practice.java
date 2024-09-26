class ffather {
    public void greet() {
        System.out.println("hello i am father");
    }
}

class sson extends ffather{
    public void greet2(){
        System.out.println("hello i am father");
    }

}

class ddaughter extends sson{
    public void greet3( ){
        System.out.println("hellow i am daughter");
    }

}
public class oops_practice {
    public static void main(String [] args){
//        System.out.println("hello world");


        ddaughter d1= new ddaughter();
        d1.greet2();
    }
}
