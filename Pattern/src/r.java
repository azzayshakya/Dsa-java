public class r {
    static void pattern1(int n) {
        for(int i =1; i<=n;i++) {
            int count=5-i;
            int alphabet=65;
            for (int j = 1; j <=i; j++) {
                System.out.print((char)(alphabet+count));
                count++;
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        pattern1(5);
    }
}
