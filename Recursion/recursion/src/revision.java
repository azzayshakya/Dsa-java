public class revision {
    public static void recursion(int i) {
        if(i==1){
            System.out.println(i);

            return;

        }

        System.out.println(i);
        recursion(i-1);



    }
    public static void main(String[] args) {
        System.out.println("ajay");
        recursion(10);
    }
}
