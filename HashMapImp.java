import java.util.*;
public class HashMapImp{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        
        // for (String key : map.keySet()) {

        //     if(key == "B")
        //     System.out.println(map.get(key));
        // }


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}