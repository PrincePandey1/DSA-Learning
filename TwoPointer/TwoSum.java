import java.util.ArrayList;

public class TwoSum{

    public static ArrayList findTwoSum(int[]numbers, int target){

        ArrayList<Integer> list = new ArrayList<>();
      
         int first = 0;
         int last = numbers.length-1;


         while(first < last){

             int sum = numbers[first]+numbers[last];

             if(sum == target){
                list.add(numbers[first]);
                list.add(numbers[last]);

                 break;
             }else if(sum < target){
                first++;
             }else{
                last--;
             }
         }

         return list;

    }

    public static void main(String[] args) {

        int[] inp = {2,3,5,7};
        int target = 8;

        ArrayList<Integer> l = findTwoSum(inp, target);

        System.out.println("Two sum number is : " + l);

        
    }
}