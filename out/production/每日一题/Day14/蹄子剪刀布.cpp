#include <iostream>
using namespace std;

int main()
{
    int n, cnt1 = 0, cnt2 = 0;
    cin >> n;

    while (n -- )
    {
        int x, y;
        cin >> x >> y;
        x--, y--;  
        if ((x + 1) % 3 == y)  cnt1++;  
        if (x == (y + 1) % 3)  cnt2++;  
    }

    cout << max(cnt1, cnt2);
    return 0;
}