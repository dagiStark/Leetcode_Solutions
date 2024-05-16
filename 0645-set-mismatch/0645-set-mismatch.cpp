class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int n=nums.size();
        vector<int>v;
        int i=0;
        while(i<n){
            int e=nums[i]-1;
            if(nums[e]==nums[i] ||e==i){
               // v.push_back(nums[i]);
                i++;}
            // }
            // else if(nums[e]==i+1)i++;
            else{
                swap(nums[e],nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                v.push_back(nums[i]);
                cout<<v[0];
                v.push_back(i+1);
                return v;
             
            }
        }
        return v;
          
    }
};