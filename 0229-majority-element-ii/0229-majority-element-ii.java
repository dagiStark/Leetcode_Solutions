class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
      List<Integer> ans = new ArrayList<>();

        for(int i = 0; i< nums.length; i++){
            int temp = 0;
            for(int j = i ; j< nums.length; j++){
                if(nums[i] == nums[j]) temp++;
            }
            if(temp > n) ans.add(nums[i]);
        }
        return ans;
    }
}