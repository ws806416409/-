#include <iostream>
#include <algorithm>
#include <vector>
#include <string>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    bool isPalindrome(ListNode* head) {
        ListNode *p = head;
        vector<int> v;
        while (p != nullptr) {
            v.emplace_back(p->val);
            p = p->next;
        }
        //for(auto it : v) cout << it << " ";
        int l = 0, r = v.size() - 1;
        while (l < r) {
            if (v[l++] != v[r--]) return false;
        }
        return true; 
    }
};
