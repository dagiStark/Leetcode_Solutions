class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count =0;
        for(int i:arr1){
            int m =0;
            for(int j: arr2){
                if(Math.abs(i-j) <= d) break;
                else m++;
            }
            if(m == arr2.length) count ++;
        }
        return count;
    }
}