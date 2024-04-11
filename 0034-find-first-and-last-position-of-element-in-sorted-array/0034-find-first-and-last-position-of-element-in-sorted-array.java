class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1, -1};
        int start = 0, end = nums.length -1;
        while(start < nums.length){
            if(nums[start] == target) break;
            start++;
        }
        if(start == nums.length) return ans;
        while( end > -1){
            if(nums[end] == target) break;
            end--;
        } 
        ans[0] = start;
        ans[1] = end;
        return ans;
 
    }
}