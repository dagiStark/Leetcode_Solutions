class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        int ans = 0, j = nums.length-1;
        Arrays.sort(nums);
        for(int i=nums.length/2-1; i>=0; i--){
            if(nums[i] <= nums[j]/2){
                ans += 2;
                j--;
            }
        }
        return ans;
    }
}