class Father{
    public void greet(){
        System.out.println("i am big");
    }
}
class Son extends Father{
    public void greet2(){
        System.out.println("i am son");
    }
    static {
        System.out.println("yoo");
    }
}
class Daughter extends Son{
    public void greet3(){
        System.out.println("i am daughter");
    }
}

class shape{
    int h;
    int l;
    static void info(){
        System.out.println("printing the shapes info.. ");
    }
}
class tringle extends shape{
    public int shape(int l,int h){

        System.out.println("this is ur trinle shape");
        System.out.println("this is ur trinle shape");
            return 1/2*l*h;
    }
}


public class inheritance {
    public static void main(String[] args){
//        System.out.println("heyyy");
        Father f1 =new Daughter();
        f1.greet();

        Son s1 = new Son();
        s1.greet();

        Daughter d1 = new Daughter();
        d1.greet();

        shape a1 = new shape();
        a1.l=5;
        a1.h=8;
        shape.info();

        tringle t1= new tringle();
        System.out.println(t1.shape(5,9));



    }

}
