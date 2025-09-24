public class Main {
    String name;
    int age;
    Main(String name,int age ){
        System.out.println("counstructer called");
        this.age=age;
        this.name=name;
    }

//    static void a(){
//        System.out.println("ajju");
//    }
    public static void main(String[] args){
        System.out.println("hyyy");
//        a();
        Main a = new Main("ajay",12);
        System.out.println(a.name);

        System.out.println(a.age);

    }
}