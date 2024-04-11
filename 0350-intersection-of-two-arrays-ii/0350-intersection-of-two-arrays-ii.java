class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Stack<Integer> ans = new Stack<>();
      Stack<Integer> search = new Stack<>();

      for(int i: nums1){
         ans.add(i);
      }

      for(int i : nums2){
         if(ans.remove((Integer) i)){
            search.add(i);
         }
      }
      int[] solution = new int[search.size()];
      int j =0;
      for(int i: search){
         solution[j] = i;
         j++;
      }
      return solution;
    }
}