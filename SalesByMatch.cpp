#include <bits/stdc++.h>
using namespace std;

int a[1000001], b[1000001];

int main()  {
    int n, j = 0, ans = 0;
    cin >> n;

    for (int i = 0; i < n; i++) {
      cin >> a[i];
    }
    sort(a, a + n);

    for (int i = 0; i < n; i++) {
      if (a[i] != a[i + 1]) {
        b[j] = a[i];
        j++;
      }
    }
    // for (int i = 0; i < j; i++) {
    //   cout << b[i] << " ";
    // }
    // cout << endl;
    // for (int i = 0; i < n; i++) {
    //   cout << a[i] << " ";
    // }
    // cout << endl;

    for (int i = 0; i < j; i++) {
      int c = 0;
      for (int k = 0; k < n; k++) {
        if (b[i] == a[k]) {
          // cout << "! " << b[i] << " " << a[k] << endl;
          c++;
          // cout << "c: " << c << endl;
          if (c == 2) {
            c = 0;
            ans++;
            // cout << "ans: " << ans << endl;
          }
        }
      }
    }

    cout << ans << endl;
    return 0;
}
