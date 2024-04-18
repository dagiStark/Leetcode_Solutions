class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> test = new ArrayList<>();
      for(int i: nums){
         test.add(i*i);
      }
      Collections.sort(test);
      int[] ans = new int[test.size()];
      int j =0;
      for(int i: test){
         ans[j] = i;
         j++;
      }
      return ans;
    }
}