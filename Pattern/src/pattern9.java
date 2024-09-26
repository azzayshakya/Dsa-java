public class pattern9 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("X");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            int count =4-i;

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<2*count+1;k++){
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern(5);

    }

}
