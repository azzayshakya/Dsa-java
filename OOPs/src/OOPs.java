import com.sun.tools.jconsole.JConsoleContext;

class Student{
    int id;
    String name;
    public void someinfo(int x,String y){
        this.id=x;
        this.name=y;
        System.out.println("this is your info "+id+" "+name );
    }
    Student(){
        System.out.println("heyy students");
    }
}
public class OOPs {

    public void greet(){
        System.out.println("how are you bro !");
    }
    OOPs(int x, String y){

        System.out.println(x +" "+ y);
    }
    public static void main(String[] args){
        Student s1= new Student();

//        s1.someinfo(1,"ajay");
        Student s2=new Student();
//        s2.someinfo(2,"aman");
        OOPs o1=new OOPs(1,"ajay");
        OOPs o2=new OOPs(2,"aman");
        OOPs o3=new OOPs(3,"ankit");


//        o1.greet();

    }
}
