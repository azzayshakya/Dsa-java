public class increasing_order {
//    public static void  incOrder(int s , int e){
//        if (s==e){
//            System.out.println(s+" ");
//            return;
//        }
//        System.out.print(s+" ");
//        incOrder(s+1,e);
//    }
public static void  incOrder(int n){
    if (n==1){
        System.out.println(1);
        return;
    }
    incOrder(n-1);
    System.out.println(n);

}

    public static void main(String[] args){
        incOrder(10);
    }
}
