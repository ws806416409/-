#include <bits/stdc++.h>

using namespace std;

typedef pair<int,int> PII;
const int N = 55;
vector<PII> points[2];
int n,m;
char mp[N][N];
int dd[4][2] = {{-1,0},{0,1},{1,0},{0,-1}};

void dfs(int x, int y, vector<PII>& p){
    p.emplace_back(make_pair(x,y));
    mp[x][y] = '$';
    for(int i = 0; i < 4; i++){
        int dx = x + dd[i][0];
        int dy = y + dd[i][1];
        if(dx >= 0 && dx < n && dy >=0 && dy < m && mp[dx][dy] == 'X'){
            dfs(dx, dy, p);
        }
    }
}

int main()
{
    cin >> n >> m;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cin >> mp[i][j];
        }
    }

    for(int i = 0,k = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if(mp[i][j] == 'X'){
                dfs(i, j, points[k++]);
            }
        }
    }

    int res = INT_MAX;
    for(auto p1 : points[0])
        for(auto p2 : points[1])
            res = min(res, (abs(p2.first - p1.first) + abs(p2.second - p1.second))-1);
    cout << res;

}