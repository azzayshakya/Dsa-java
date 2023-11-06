public class pattern3 {
    static void pattern(int n){

        for(int i=0;i<n;i++){
            int cout =1;
            for(int j=0;j<=i;j++){
                System.out.print(cout);
                cout++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        pattern(5);

    }
}
