public class pattern16 {



    static void pattern(int n) {

        int alphabet = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + i));
            }
            System.out.println();


        }
    }
        public static void main (String[]args){
            pattern(5);

        }
    }
