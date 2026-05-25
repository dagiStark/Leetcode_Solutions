import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int maxProduct(int[] nums) {

        // Step 1: Max heap
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        // Step 2: Add all numbers
        for (int num : nums) {
            pq.add(num);
        }

        // Step 3: Get top two numbers
        int first = pq.poll();   // largest
        int second = pq.poll();  // second largest

        // Step 4: compute result
        return (first - 1) * (second - 1);
    }
}