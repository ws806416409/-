#include <iostream>
#include <vector>
#include <climits>
using namespace std;
int main()
{
    int n;
    cin >> n;
    vector<int> v(n);
    for(int i = 0; i < n; i++){
        cin >> v[i];
    }
    int res = INT_MAX;
    for(int i = 0; i < n; i++){
        int cur = 0;
        for(int j = 1; j < n; j++){
            cur += j * v[(i + j) % n];
        }
        res = min(res, cur);
    }
    cout << res << endl;
    return 0;
}