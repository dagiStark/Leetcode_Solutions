class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<>();

        // Store all jewel types
        for (char c : jewels.toCharArray()) {
            jewelSet.add(c);
        }

        int count = 0;

        // Count stones that are jewels
        for (char c : stones.toCharArray()) {
            if (jewelSet.contains(c)) {
                count++;
            }
        }

        return count;
    }
}