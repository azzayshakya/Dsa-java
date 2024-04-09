import java.util.*;
class union{
    public List<Integer> find_union(int arr1[] , int arr2[] ){
        List<Integer> list=new ArrayList<Integer>();
        for(int i =0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    list.add(i);
                }
            }
        }
        return list;

    }

        }
public class Find_union {

    public static void main(String[] args) {
        int arr1[]={1,2,4,5,6,7,8};
        int arr2[]={1,2,4,6,7,8,9};
        union u1= new union();
        u1.find_union(arr1,arr2);
        List<Integer> result = u1.find_union(arr1, arr2);

        System.out.println("Common elements in both arrays:");
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }


    }
}
