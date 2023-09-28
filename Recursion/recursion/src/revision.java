public class revision {
    public static void fibo(int n){
        int num1=0;
        int num2=1;
        for(int i=1;i<=n;i++){
            System.out.println(num1);
            int sum = num1+num2;
            num1=num2;
            num2=sum;

        }
    }

    public static void main(String[] args) {
        fibo(10);
    }
}
