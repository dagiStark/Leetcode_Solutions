class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long concatination = 0;
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            long k = Long.parseLong(String.valueOf(nums[i]) + String.valueOf(nums[j]));
            concatination += k;
            i++;
            j--;
        }
        if(nums.length % 2 != 0) concatination += Long.parseLong(String.valueOf(nums[i]));
        
        return concatination;
    }
}