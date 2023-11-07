public class pattern15 {
    static void pattern(int n){
        int alphabet=65;
        for(int i=0;i<n;i++){
            int count=5-i;


            for(int j=0;j<count;j++){
                System.out.print((char)(alphabet+j));



            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pattern(5);

    }
}
