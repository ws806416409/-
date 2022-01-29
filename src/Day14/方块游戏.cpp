#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    map<char, int> m;
    string a, b;
    for (int i = 0; i < n; i++) {
        cin >> a >> b;
        map<char ,int> a1;
        map<char, int> b1;
        for (auto ch : a) {
            a1[ch]++;
        }
        for (auto ch : b) {
            b1[ch]++;
        }
        for (char it = 'a'; it <= 'z'; it++) {
            m[it] += max(a1[it], b1[it]);
        }
    }
    for (char it = 'a'; it <= 'z'; it++) {
        cout << m[it] << endl;
    }
    return 0;
}
