public class factorial {
    public static int facto(int n){
        if (n==0){
            return 1;

        }
        facto(n-1);
        int fnm1 =facto(n-1);
        int fn=n*fnm1;
        return fn;
    }
    public static void main(String[] args){
        System.out.println(facto(5));
    }
}
