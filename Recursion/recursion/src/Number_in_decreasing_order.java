public class Number_in_decreasing_order {
    public static void decOrder(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        decOrder(n-1);

    }
    public static void main(String[] args){
        int n =10;
        decOrder(n);

    }
}
