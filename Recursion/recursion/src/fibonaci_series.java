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
        System.out.println(fib(2));
    }
}

// you can print the series too
//using this program




//public class fibonaci_series {
//    public static void fibo(int n){
//        int num1=0;
//        int num2=1;
//        for(int i=1;i<=n;i++){
//            System.out.println(num1);
//            int sum = num1+num2;
//            num1=num2;
//            num2=sum;
//
//        }
//    }
//
//    public static void main(String[] args) {
//        fibo(10);
//    }
//}

