public class pattern7 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");


            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("X");
            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        pattern(5);

    }
}
