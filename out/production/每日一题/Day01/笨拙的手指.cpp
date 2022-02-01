
#include <bits/stdc++.h>

using namespace std;

int main()
{
    string n1,n2;
    cin >> n1 >> n2;
    int len1 = n1.size(), len2 = n2.size();
     for(int i = 0; i < len1; i ++){
         char p = n1[i];
         n1[i] ^= 1;
        for(int j = 0; j < len2; j ++){
            char q = n2[j];
            for(char k = '0'; k <= '2'; k++){
                if(q == k) continue;
                n2[j] = k;
                int x = 0, y = 0;
                for (int i = 0; i < len1; i ++ ) x = x * 2 + n1[i] - '0';
                for (int i = 0; i < len2; i ++ ) y = y * 3 + n2[i] - '0';
                if(x == y){
                    cout << x << endl;
                    return 0;
                } 
            }
            n2[j] = q;
        }
        n1[i] = p;
     }
     cout << "ERROR" << endl;
}