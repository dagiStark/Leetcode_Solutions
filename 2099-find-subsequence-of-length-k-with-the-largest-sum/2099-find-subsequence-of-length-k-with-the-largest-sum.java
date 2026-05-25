import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        // Step 1: Min heap based on value
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]   // compare values
        );

        // Step 2: Keep only k largest elements
        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});

            if (pq.size() > k) {
                pq.poll(); // remove smallest value
            }
        }

        // Step 3: Extract elements from heap
        List<int[]> list = new ArrayList<>();

        while (!pq.isEmpty()) {
            list.add(pq.poll()); // (value, index)
        }

        // Step 4: sort by original index to maintain order
        list.sort((a, b) -> a[1] - b[1]);

        // Step 5: build result
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i)[0];
        }

        return result;
    }
}