public class pattern12 {
    static void pattern(int n){
        for(int i=0;i<n;i++){
            int start=1;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=start+1;

            }
            int count =4-i;
            for(int L=0;L<=count*2;L++){
                System.out.print(" ");
            }
            int value=i+1;

            for(int k=0;k<=i;k++){
                System.out.print(value);
                value--;
            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        pattern(5);

    }
}
