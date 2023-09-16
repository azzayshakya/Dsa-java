import java.util.HashMap;
public class hashmapBasic_1 {

    public static void main(String[] args) {
    HashMap<String,Integer> hm= new HashMap<>();
        hm.put("india",100);
                hm.put("aus",100);
                hm.put("eng",100);
                hm.put("dubai",100);

        System.out.println(hm);

        int getoutput= hm.get("india");
        System.out.println(getoutput);

        

}
}
