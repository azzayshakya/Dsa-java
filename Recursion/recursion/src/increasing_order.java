public class increasing_order {
    public static void  incOrder(int s , int e){
        if (s==e){
            System.out.println(s+" ");
            return;
        }
        System.out.print(s+" ");
        incOrder(s+1,e);
    }
    public static void main(String[] args){
        incOrder(1,10);
    }
}
