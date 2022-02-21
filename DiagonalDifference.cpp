#include <bits/stdc++.h>
using namespace std;

int m[1001][1001];

int main()  {
    int n, diff;
    cin >> n;
    int s1 = 0, s2 = 0, a = 0, b = n - 1;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        cin >> m[i][j];
        if (i == n/2 && j == n/2 && n % 2 == 1) {
          s1 += m[i][j];
          s2 += m[i][j];
          a++;
          b--;
        }
        else if (i == j) {
          s1 += m[i][j];
        }
        else if (i == a && j == b) {
          s2 += m[i][j];
          a++;
          b--;
        }
      }
    }

    diff = abs(s1 - s2);

// 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

    cout << diff << endl;
    return 0;
}
