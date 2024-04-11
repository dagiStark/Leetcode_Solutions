class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] ans  = new int[n];
        int alen = nums1.length;
        int blen = nums2.length;
        System.arraycopy(nums1, 0, ans, 0, alen);
        System.arraycopy(nums2, 0, ans, alen, blen);
        Arrays.sort(ans);
        if(n % 2 != 0) return ans[n/2];
        else {
            double num = (ans[n/2] + ans[n/2-1] ) / 2.0;
            return num;
        } 

    }
}