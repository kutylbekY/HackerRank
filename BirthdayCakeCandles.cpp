#include <bits/stdc++.h>
using namespace std;

int a[1000001];

int main()  {
    long long max = -999999999999;
    int n, c = 0;
    cin >> n;

    for (int i = 0; i < n; i++) {
      cin >> a[i];
      if (max < a[i]) {
        max = a[i];
      }
    }
    for (int i = 0; i < n; i++) {
        if (max == a[i]) {
          c++;
        }
    }


    cout << c << endl;
    return 0;
}
