import java.util.HashMap;
public class hashmapBasic_1 {

    public static void main(String[] args) {
    HashMap<String,Integer> hm= new HashMap<>();
        hm.put("india",100);
                hm.put("aus",100);
                hm.put("eng",100);
                hm.put("dubai",100);

        System.out.println(hm);

        System.out.println("using get functioen");


        int getoutput= hm.get("india");

        System.out.println(getoutput);
        System.out.println(hm.get("ajay"));


        System.out.println("using contains function");


        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("pakistan"));


        System.out.println("using  remove  functioen");


        System.out.println(hm.remove("dubai"));
        System.out.println(hm);


        System.out.println("using clear function");
        hm.clear();
        System.out.println(hm);








}
}
