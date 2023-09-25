public class basic_3 {
    public static void printName(int i){
       if(i==1){
           System.out.println(i);
           return;
       }
        System.out.println(i);

       printName(i-1);
    }
    public static void main(String[] args){
        printName(10);
    }
}
