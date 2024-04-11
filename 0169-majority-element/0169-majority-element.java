class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
      for (int i =0;i< nums.length; i++) {
         int point = 0;
         for(int j = i;j < nums.length; j++){
            if(nums[j] == nums[i]){
               point++;
            }
         }
         if(point > nums.length/2){
            ans = nums[i];
         }
         
      }

      return ans;
    }
}