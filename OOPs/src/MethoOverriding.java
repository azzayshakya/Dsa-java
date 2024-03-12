public class MethoOverriding {
    int a ,b ,c;

    static  void add(int a ,int b){
        System.out.print(a+b);
    }
    static void add (int a , int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args){
        System.out.println("hey ");
        add(4,5);
        System.out.println();
        add(2,4,8);
    }
}
