class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> test = new HashSet<>();
      for(int i: nums){
         test.add(i);
      }

      return !(test.size() == nums.length);
    }
}