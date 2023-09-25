public class basic_2 {

    public static void PrintName(int n){
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintName(n-1);

    }


    public static void main(String[] args){
        System.out.println("ajay");

        PrintName(10);
    }
}

