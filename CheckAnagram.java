import java.util.*;

//For Non-Primitive datatype(Integer, String) -> .equals() -> to compare the actual value
//For Primitive Data type(int, char) -> ||, != -> it works and compare the value.

public class CheckAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map_str1 = new HashMap<>();
        HashMap<Character, Integer> map_str2 = new HashMap<>();

        for (char ch1 : s.toCharArray()) {
            // map.put(c, map.getOrDefualt(c,0)+1);
            map_str1.put(ch1, map_str1.getOrDefault(ch1, 0) + 1);
        }

        for (char ch2 : t.toCharArray()) {
            map_str2.put(ch2, map_str2.getOrDefault(ch2, 0) + 1);
        }

        System.out.println("Map1 size : " + map_str1.size());
        System.out.println("Map2 Size : " + map_str2.size());

        System.out.println("Map1 Value : " + map_str1.values());
        System.out.println("Map2 Value : " + map_str2.values());

        // if (map_str1.size() != map_str2.size())
        // return false;
        // else
        for (Map.Entry<Character, Integer> entry : map_str1.entrySet()) {

            Character key = entry.getKey();
            if (!map_str2.containsKey(key) || !map_str1.get(key).equals(map_str2.get(key)))
                return false;
        }
        return true;
        // System.out.println(map.keySet());
        // System.out.println(map.values());
        // Map.Entry<String, Integer> entry : map.entrySet()

        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        // Character key = entry.getKey();
        // Integer value = entry.getValue();

        // if (value % 2 != 0)
        // return false;
        // // System.out.println(key + " -> " + value);
        // }
        // return true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("aacc", "ccac"));
        // isAnagram("rat", "car");
    }
}