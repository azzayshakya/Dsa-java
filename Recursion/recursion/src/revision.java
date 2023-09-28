public class revision {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }

        fibo(n-1);
        fibo(n-2);

        int fnm1=fibo(n-1);
        int fnm2 =fibo(n-2);

        int f=fnm1+fnm2;
        return f;
    }

    public static void main(String[] args) {
        System.out.println(fibo(10));
    }
}
