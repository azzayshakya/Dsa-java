public class revision {
    public static void recursion(String s,int i,int n) {
        if(i>=n){

            return;

        }
        System.out.println(s);
        recursion(s,i+1,n);


    }
    public static void main(String[] args) {
        System.out.println("ajay");
        recursion("ajay",1,5);
    }
}
