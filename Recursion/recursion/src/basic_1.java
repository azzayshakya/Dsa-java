public class basic_1 {

    public static void PrintNum(int n,int i){
        if(i==n){
            System.out.println(i);
            return ;

        }

        System.out.println(i);
        PrintNum(n,i+1);

    }


    public static void main(String[] args){
      PrintNum(10,1);
    }
}

