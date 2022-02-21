#include <bits/stdc++.h>
using namespace std;

int a[101], b[101], res[101];

int main()  {
    int n, m, min = 99999, max = -99999, x = 0;
    cin >> n >> m;

    for (int i = 0; i < n; ++i) {
      cin >> a[i];
      if (a[i] > max) {
        max = a[i];
      }
    }
    for (int i = 0; i < m; ++i) {
      cin >> b[i];
      if (b[i] < min) {
        min = b[i];
      }
    }
    // cout << "Min/Max: " << min << " " << max << endl;

    for (int k = max; k <= min; ++k) {
      int q = 0, p = 0;
      for (int i = 0; i < n; ++i) {
        if (k % a[i] == 0) {
          q++;
          // cout << "K/a[i] " << k << " " << a[i] << endl;
        }
      }
      // cout << "Q " << q << endl;

      if (q == n) {
        for (int j = 0; j < m; ++j) {
          if (b[j] % k == 0) {
            p++;
            // cout << "K/b[j] " << k << " " << b[j] << endl;
          }
        }
        // cout << "P " << p << endl;
        if (p == m) {
          res[x] = k;
          x++;
          // cout << "res, x " << res[x - 1] << " " << x << endl;
        }
      }
    }

    // for (int i = 0; i < n; ++i) {
    //   cout << res[i] << " ";
    // }
    // cout << endl;

    cout << x << endl;
    return 0;
}
