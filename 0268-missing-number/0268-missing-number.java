class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> search = new HashSet<>();
      for(int i: nums){
         search.add(i);
      }
      for(int i = 0;i<= nums.length;i++){
         if(!search.contains(i)){
            return i;
         }
      }
      return 0;
    }
}