class Solution {
    public int distinctAverages(int[] nums) {
        ArrayList<Integer> newNums = new ArrayList<>();
        Set<Double> ans = new HashSet<>();
        for(int i: nums) newNums.add(i);
        while(!newNums.isEmpty()){
            int max = Collections.max(newNums);
            int min = Collections.min(newNums);
            double average = (double)(min + max)/2;
            ans.add(average);
            newNums.remove(newNums.indexOf(max));
            newNums.remove(newNums.indexOf(min));
        }

        return ans.size();

    }
}