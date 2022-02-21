#include <bits/stdc++.h>
using namespace std;

int a[1001];

int main()  {
    int n, min = 99999999, max = -99999999, m = 0, l = 0;
    cin >> n;

    for (int i = 0; i < n; ++i) {
      cin >> a[i];
    }
    max = a[0];
    min = a[0];

    for (int i = 1; i < n; ++i) {
      if (a[i] > max) {
        max = a[i];
        m++;
      }
      if (a[i] < min) {
        min = a[i];
        l++;
      }
    }

    cout << m << " " << l << endl;
    return 0;
}
