public class revision {
    public static int  recursion(int n) {
        if(n==1){
            return 1;
        }

        recursion(n-1);
        int fanm1=recursion(n-1);
        int fn=n+fanm1;

        return fn;




    }
    public static void main(String[] args) {
        System.out.println("ajay");
        System.out.println(recursion(10));
    }
}
