#include <bits/stdc++.h>
#define x first
#define y second
using namespace std;
unordered_map<int, int> m;
unordered_map<int, int> ex;
int res = 0;
int bfs(int idx)
{
    int cnt = 0;
    queue<int> q;
    q.push(idx);
    while(!q.empty()){
        int f = q.front();
        q.pop();
        cnt++;
        for(int i = -ex[f]; i <= ex[f]; i++){
            if(ex[f + i] == -1){
                q.push(f + i);
                ex[f + i] = ex[f] + 1;
            }
        }
    }
    res = max(res, cnt);
}
int main()
{
    int n,idx;
    cin >> n;
    while(n--){
        cin >> idx;
        m[idx] = -1;
    }
    for(auto it : m){
        ex = m;
        ex[it.x] = 1;
        bfs(it.x);
    }
    cout << res << endl;
}