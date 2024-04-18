class Solution {
    public int dominantIndex(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
      int check =0;
      int checker =0;

      for(int i = 0;i < nums.length; i++){
         if(max >= nums[i]*2 ){
            check ++;
         }else{
            checker = i;
         }
      }
      if(check == nums.length-1){
         return checker;
      }else{
         return -1;
      }
    }
}