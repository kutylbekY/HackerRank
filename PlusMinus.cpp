#include <bits/stdc++.h>
using namespace std;

int a[1001];

int main()  {
    double q, p = 0, n = 0, z = 0;
    double rp, rn, rz;
    cin >> q;

    for (int i = 0; i < q; i++) {
      cin >> a[i];
      if (a[i] > 0) {
        p++;
      }
      else if (a[i] < 0) {
        n++;
      }
      else {
        z++;
      }
    }
    rp = p/q;
    rn = n/q;
    rz = z/q;

// 6
// -4 3 -9 0 4 1
    cout << setprecision(6) << rp << endl;
    cout << setprecision(6) << rn << endl;
    cout << setprecision(6) << rz << endl;
    return 0;
}
