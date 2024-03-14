#include <vector>
#include <algorithm>

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> store;
        for (int i = 0; i < nums.size(); ++i) {
            int diff = target - nums[i];
            if (store.find(diff) != store.end()) {
                return {store[diff], i};
            }
            store[nums[i]] = i;
        }
        // If no solution found, return an empty vector
        return {};
    }
};
