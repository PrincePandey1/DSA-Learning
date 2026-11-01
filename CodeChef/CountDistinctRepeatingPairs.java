// import java.util.Set;

// public class CountDistinctRepeatingPairs{

//     // public static int distinctRepeatingPairs(String s){

//     //     // Brute-force approach 
//     //     // - For each ith character check previous substring whether they exists or not
//     //     // - T.C = O(N2)


//     //     int n = s.length()-1;

//     //     if(n < 2)
//     //         return 0;
        
       

//     //     for(int i=0; i<n-1; i++){
//     //        boolean seen = false;

//     //        for(int j=0; j<i; j++){
//     //          if(s.charAt(i) == s.charAt(j) && s.charAt(i+1) == s.charAt(j+1)){
//     //             seen = true;
//     //             break;
//     //          }
//     //        }

//     //        if(!seen){
//     //         count++;
//     //        }
             
//     //     }
//     // }



//     //Optimize approach - UseHasset to store the adjacent Substring 
//     public static int distinctRepeatingPairs(String s){

//         Set<String> seen = new HashSet<>();

//         for(int i=0; i<s.length()-1; i++){
//             seen.add(s.substring(i, i+2));
//         }

//         return seen.size();
//     }


//     public static void main(String[] args) {

//       String inp = "ababc";
//       System.out.println("The count of repeating String : "+distinctRepeatingPairs(inp));
    
//    }

// }





import java.util.HashSet;
import java.util.Set;

public class CountDistinctRepeatingPairs {

    // Brute force: O(n^2)
    public static int distinctPairsBrute(String s) {
        int n = s.length();
        if (n < 2) return 0;

        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean seen = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j) && s.charAt(i + 1) == s.charAt(j + 1)) {
                    seen = true;
                    break;
                }
            }

            if (!seen) count++;
        }
        return count;
    }

    // Optimized: HashSet, O(n)
    public static int distinctPairsOptimized(String s) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < s.length() - 1; i++) {
            seen.add(s.substring(i, i + 2));
        }
        return seen.size();
    }

    public static void main(String[] args) {
        String inp = "ababc";
        System.out.println("Brute force : " + distinctPairsBrute(inp));      // 3
        System.out.println("Optimized   : " + distinctPairsOptimized(inp));  // 3
    }
}