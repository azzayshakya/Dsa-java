import java.util.Scanner;


public class Java_basic {
    int id;
    String name;
    public String getname(){
        return name;
    }
    public void setName(String  s){
        name=s;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }


    public static void main(String[] args){
//        System.out.println("printing the tables");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("type the number");
//        int num=sc.nextInt();
//        for (int i=1; i <=10;i++){
//            System.out.println(i*num);
//        }
//        System.out.println("thnxx");

//        System.out.println("printing the odd numbers");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("type the number");
//        int num=sc.nextInt();
//        for (int i=0; i <=num;i++){
//            System.out.println(2*i+1);
//        }
//        System.out.println("thnxx");

        Java_basic myInfo= new Java_basic();
        myInfo.setName("ajay");
        System.out.println("this is your name "+myInfo.getname());

        myInfo.setId(2001280100);
        System.out.println("this is your id "+myInfo.getId());




    }
}
