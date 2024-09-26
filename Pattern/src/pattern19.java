public class pattern19 {
    static void pattern(int n){
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("X");
            }
            int value = 2 * i;
            for (int j = 0; j < value; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("X");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int a=0;a<=i;a++){
                System.out.print("X");
            }
            int space=8-(2*i);
            for(int b=0;b<space;b++){
                System.out.print(" ");
            }
            for(int c=0;c<=i;c++){
                System.out.print("X");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(5);

    }
}
