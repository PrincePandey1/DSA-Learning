package Heap;

import java.util.PriorityQueue;

public class MinimumCostToConnectRopes {

    public static int MinimumCostToConnectRopesImp(int[] inp) {

        if (inp.length == 1)
            return 0;
        // code here
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < inp.length; i++) {
            queue.add(inp[i]);
        }

        int cost = 0;

        while (queue.size() >= 2) {

            int first = queue.poll();
            int second = queue.poll();

            cost += first + second;
            queue.add(first + second);

        }
        return cost;
    }

    public static void main(String[] args) {

        int[] inp = { 1, 2, 3, 4, 5 };

        System.out.println("Minimum Cost : " + MinimumCostToConnectRopesImp(inp));

    }
}
