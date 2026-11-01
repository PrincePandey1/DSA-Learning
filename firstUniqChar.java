import java.util.HashMap;

class Solution {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int curr = -1;
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c,0)+1);
            if(map.get(c) < 2){
                curr = c;
                System.out.println("The value of curr " + c);
            }else{
                break;
            }
        }
        System.out.println(map);
        return s.indexOf(curr)-1;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(firstUniqChar("loveleetcode"));
    }
}