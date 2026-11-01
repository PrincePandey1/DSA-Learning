package Heap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KClosetNumber {

    public static ArrayList<Integer> main(int[] arr, int k, int x) {

        ArrayList<Integer> list = new ArrayList<>();
        // Max-heap(Commp: If the diff b/w the two value is same. Then take the value
        // which is smaller than other)
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[0] != a[0] ? b[0] - a[0] : b[1] - a[1]);

        // PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int val : arr) {
            queue.offer(new int[] { Math.abs(val - x), val });

            if (queue.size() > k) {
                queue.poll();
            }
        }

        while (!queue.isEmpty()) {
            int[] pair = queue.poll();
            list.add(pair[1]); // pair[1] = actual value (second element)
        }
        Collections.sort(list);
        return list;

    }

    public static void main(String[] args) {

        int ar[] = { 1, 2, 3, 4, 5 };
        int k = 4, x = 3;

        ArrayList<Integer> ans = main(ar, k, x);
        System.out.println("The Kth Closet Number : " + ans);
    }

}
