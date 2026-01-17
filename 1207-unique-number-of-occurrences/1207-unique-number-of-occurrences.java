class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        // Step 1: Count frequency of each number
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check if frequencies are unique
        Set<Integer> seenCounts = new HashSet<>();

        for (int count : countMap.values()) {

            // If this count already exists, it's not unique
            if (seenCounts.contains(count)) {
                return false;
            }

            seenCounts.add(count);
        }

        return true;
    }
}
