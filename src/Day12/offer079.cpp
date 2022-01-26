#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<vector<int>> ans;
    vector<int> arr;
    void dfs(vector<int> v, int n){
        if (n <= v.size()) {
            ans.emplace_back(arr);
        } else {
            return;
        }
        for (int i = n; i < v.size(); i++) {
            arr.emplace_back(v[i]);
            dfs(v, i + 1);
            arr.pop_back();
        }
    }
    vector<vector<int>> subsets(vector<int>& nums) {
        dfs(nums, 0);
        return ans;
    }
};
int main()
{
    vector<int> nums = {1,2,3};
    Solution s;
    s.subsets(nums);
    for (auto it : s.ans) {
        for (auto each : it) {
            cout << each << " ";
        }
        cout << endl;
    }
    return 0;
}