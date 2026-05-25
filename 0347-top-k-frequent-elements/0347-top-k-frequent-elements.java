import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Bucket array: index = frequency
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int key : freq.keySet()) {
            int count = freq.get(key);

            if (buckets[count] == null)
                buckets[count] = new ArrayList<>();

            buckets[count].add(key);
        }

        int[] result = new int[k];
        int idx = 0;

        // Traverse from highest frequency
        for (int i = buckets.length - 1; i >= 0 && idx < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[idx++] = num;

                    if (idx == k)
                        break;
                }
            }
        }

        return result;
    }
}