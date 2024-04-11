class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashNums2 = new HashSet<>();
      HashSet<Integer> hashAns = new HashSet<>();

      for(int j: nums2){
         hashNums2.add(j);
      }
      for(int i: nums1){
         if(hashNums2.contains(i)){
            hashAns.add(i);
         }
      }
      
      int[] ans = new int[hashAns.size()];
      int j =0;
      for(int i: hashAns){
         ans[j] = i;
         j++;
      }

      return ans;
    }
}