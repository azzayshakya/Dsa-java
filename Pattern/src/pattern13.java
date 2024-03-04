public class pattern13 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            int value=1+i;
            for(int j=0;j<=i;j++){
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        pattern(5);

    }
}
