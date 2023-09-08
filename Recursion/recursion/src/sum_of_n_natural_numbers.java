import javax.print.attribute.standard.MediaSize;

public class sum_of_n_natural_numbers {
    public static int NATURALsum(int n){
        if (n==1){
            return 1;
        }
        NATURALsum(n-1);

        int nat=NATURALsum(n-1);
        int sum=n + nat;
        return sum;
    }
    public static void main(String[] args){
        System.out.println(NATURALsum(5));

    }
}
