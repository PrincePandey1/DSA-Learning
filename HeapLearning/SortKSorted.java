package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class SortKSorted {

    public static ArrayList<Integer> SortKSortedArray(int[] arr, int k) {

        ArrayList<Integer> sortArray = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i : arr) {
            queue.add(i);

            if (queue.size() > k) {
                sortArray.add(queue.poll());
            }
        }

        while (!queue.isEmpty()) {
            sortArray.add(queue.poll());
        }
        return sortArray;
    }

    public static void main(String[] args) {

        int[] inp = { 6, 5, 3, 2, 8, 10, 9 };

        ArrayList<Integer> ans = SortKSortedArray(inp, 3);
        System.out.println("The K Sorted Array is : " + ans);
    }
}