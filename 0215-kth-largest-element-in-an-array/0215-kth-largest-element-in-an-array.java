class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int temp = nums.length - k;
        return nums[temp];
    }
}