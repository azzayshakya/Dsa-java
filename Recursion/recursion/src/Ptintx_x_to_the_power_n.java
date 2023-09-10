public class Ptintx_x_to_the_power_n {
    public static int power(int x,int n){
        if (n==1){
            return x;
        }
        power(x,n-1);
        int xnm1=   power(x,n-1);
        int xn = x*xnm1;
        return xn;

    }
    public static void main(String[] args){

        System.out.println(power(2,5));

    }
}
