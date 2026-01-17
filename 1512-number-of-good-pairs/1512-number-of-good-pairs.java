class Solution {
    public int numIdenticalPairs(int[] nums) {

        Map<Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;

        for (int num : nums) {

            // If we have seen this number before,
            // it forms pairs with previous occurrences
            if (countMap.containsKey(num)) {
                goodPairs += countMap.get(num);
            }

            // Increase the count for this number
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return goodPairs;
    }
}
