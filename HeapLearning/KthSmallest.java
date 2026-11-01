package HeapLearning;

import java.util.PriorityQueue;

public class KthSmallest {

    public static int KthSmallestImp(int[] inp, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < inp.length; i++) {
            queue.add(inp[i]);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        int ans = queue.poll();
        return ans;
    }

    public static void main(String[] args) {

        int[] inp = { 1, 3, 12, 5, 11, 15 };
        int k1 = 3;
        int k2 = 6;
        int first = KthSmallestImp(inp, k1);
        int second = KthSmallestImp(inp, k2);

        System.out.println(first + second);
    }

}
