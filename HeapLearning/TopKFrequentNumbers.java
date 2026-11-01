package Heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentNumbers {

    public static ArrayList<Integer> TopKFrequentNumbersImp(int[] arr, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]); // min-heap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequencies
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Maintain a min-heap of size k
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(new int[] { entry.getKey(), entry.getValue() });
            if (queue.size() > k) {
                queue.poll(); // remove least frequent
            }
        }

        // Step 3: Extract elements from heap
        while (!queue.isEmpty()) {
            list.add(queue.poll()[0]);
        }

        return list;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 1, 1, 3, 2, 2, 4 };
        int k = 2;

        System.out.println("Top " + k + " Frequent Numbers: " + TopKFrequentNumbersImp(arr, k));

    }

}