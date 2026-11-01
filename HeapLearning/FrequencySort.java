package HeapLearning

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

    public static ArrayList<Integer> freqSortImp(int[] inp) {

        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        PriorityQueue<int[]> queue = new PriorityQueue<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inp.length; i++) {
            map.put(inp[i], map.getOrDefault(inp[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.add(new int[] { entry.getKey(), entry.getValue() });
        }

        while (queue.size() > 0) {
            int data[] = queue.poll();
            int val = data[0];
            int freq = data[1];

            for (int i = 0; i < freq; i++) {
                list.add(val);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 1, 1, 3, 2, 2, 4 };
        System.out.println(freqSortImp(arr));
    }

}
