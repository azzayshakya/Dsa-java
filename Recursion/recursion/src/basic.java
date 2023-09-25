public class basic {

    public static void PrintName(String str,int n,int i){
        if(n<=i){
            return;
        }
        System.out.println(str);
        PrintName(str,n,i+1);

    }


    public static void main(String[] args){
        System.out.println("ajay");

        PrintName("ajay",3,1);
    }
}
