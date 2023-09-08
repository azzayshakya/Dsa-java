public class fibonaci_series {
    public static int fib(int n){
        if (n==0||n==1){
            return n;
        }
        fib(n-1);
        fib(n-2);
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);

        int f=fnm1+fnm2;
        return f;
    }
    public static void main(String[] args){
        System.out.println(fib(25));
    }
}
