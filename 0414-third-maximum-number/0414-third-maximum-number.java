class Solution {
    public int thirdMax(int[] nums) {
       Set<Integer> test = new TreeSet<>();
      for(int i: nums){
         test.add(i);
      }

      int ans[] = new int[test.size()];
      int j =0;
      for(int i: test){
         ans[j] = i;
         j++;
      }

      if(test.size() < 3){
         return ans[ans.length-1];
      }else{
         return ans[ans.length-3];
      }

    }
}