#include <bits/stdc++.h>
using namespace std;

int main()  {
  int x1, x2, v1, v2, cnt = 0, k = 0;
  cin >> x1 >> v1 >> x2 >> v2;

  if ((x1 > x2 && v1 > v2) || (x1 < x2 && v1 < v2)) {
    cout << "NO" << endl;
    k = 0;
  }
  else {
    while (x1 != x2 && cnt < 30000) {
      x1 += v1;
      x2 += v2;
      cnt++;

      if (x1 == x2) {
        k = 1;
        break;
      }
    }

    if (k == 1) {
      cout << "YES" << endl;
    }
    else {
      cout << "NO" << endl;
    }
  }

  return 0;
}
