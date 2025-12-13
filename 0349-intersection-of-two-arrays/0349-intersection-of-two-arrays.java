class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set = new HashSet<>();

        for(int i : nums1) set.add(i);

        List<Integer> ans = new ArrayList<>();

        for(int i : nums2){
            if(set.contains(i)){
                ans.add(i);
                set.remove(i);
            }
        }
        int[] newAns = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            newAns[i]= ans.get(i);
        }
        return newAns;

    }
}