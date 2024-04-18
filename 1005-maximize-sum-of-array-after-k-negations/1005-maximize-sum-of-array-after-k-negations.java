class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();

      for(int i: nums){
         list.add(i);
      }
      while(k >0){
         int min = Collections.min(list);
         int indexOfMin = list.indexOf(min);
         list.set(indexOfMin, -min);
         k--;
      }
      int sum =0;
      for(int i: list){
         sum += i;
      }
      return sum;
    }
}