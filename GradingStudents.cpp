#include <bits/stdc++.h>
using namespace std;

int a[1000001], r[1000001];

int main()  {
    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {
      cin >> a[i];
      if (a[i] < 38) {
        r[i] = a[i];
      }
      else if (a[i] >= 38) {
        if ((a[i] + 1) % 5 == 0) {
          r[i] = a[i] + 1;
        }
        else if ((a[i] + 2) % 5 == 0) {
          r[i] = a[i] + 2;
        }
        else {
          r[i] = a[i];
        }
      }
    }

    for (int i = 0; i < n; i++) {
      cout << r[i] << endl;
    }

    return 0;
}
