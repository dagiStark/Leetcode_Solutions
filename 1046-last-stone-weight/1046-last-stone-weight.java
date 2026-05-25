import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        while (n > 1) {
            Arrays.sort(stones, 0, n);

            int y = stones[n - 1]; // largest
            int x = stones[n - 2]; // second largest

            int diff = y - x;

            // remove two stones and add difference
            stones[n - 2] = diff;
            n--;   // one stone effectively removed
        }

        return n == 0 ? 0 : stones[0];
    }
}