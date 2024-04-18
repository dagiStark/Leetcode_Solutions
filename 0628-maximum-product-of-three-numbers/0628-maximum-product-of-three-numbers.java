class Solution {
    public int maximumProduct(int[] nums) {
         Arrays.sort(nums);
      
      int product = nums[0] * nums[1] * nums[2];
      int max = product;
      int product1 = nums[0] * nums[1] * nums[nums.length-1];
      
      for(int i = 3;i < nums.length; i++ ){
         product = nums[i] * nums[i-1] * nums[i-2];
        
         if(product >= product1 && product >= max){
            max = product;
         }else if(product1 >= product && product1 >= max){
            max = product1;
         }
      }

      return max;
    }
}