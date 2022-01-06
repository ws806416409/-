#include <bits/stdc++.h>
#define x first
#define y second
using namespace std;

const int N = 100010;
typedef pair<int,int> PII;
int n;
int h[N];
PII q[N];

int main()
{   
    scanf("%d", &n);
    for(int i = 1; i <= n; i++) scanf("%d", &h[i]);

    n = unique(h+1, h+n+1) - h - 1;
    for(int i = 1; i <= n; i++) q[i] = {h[i], i};

    sort(q+1, q+n+1);
    int res = 1, cnt = 1;
    for(int i = 1; i <= n; i++){
        int k = q[i].y;
        if(h[k-1] < h[k] && h[k+1] < h[k]) cnt--;
        else if (h[k-1] > h[k] && h[k+1] > h[k]) cnt++;

        if(i == 1 || q[i].x != q[i-1].x) res = max(res, cnt);
    }
    printf("%d", res);

    return 0;
}