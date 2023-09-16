import java.util.HashMap;
import java.util.*;

public class hashmapBasic_2_itration {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 100);
        hm.put("aus", 100);
        hm.put("eng", 100);
        hm.put("dubai", 100);

        System.out.println(hm);

        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for (String k:keys) {
            System.out.println("keys =  "+k+"  value="+hm.get(k));
        }
    }

}
