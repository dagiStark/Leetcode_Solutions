import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Count frequency of each number
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // 2. Min heap (sorted by frequency)
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> freq.get(a) - freq.get(b)
        );

        // 3. Add numbers to heap
        for (int num : freq.keySet()) {
            heap.add(num);

            // keep only k elements in heap
            if (heap.size() > k) {
                heap.poll(); // remove smallest frequency
            }
        }

        // 4. Get result
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }

        return result;
    }
}