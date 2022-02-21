#include <bits/stdc++.h>
using namespace std;

int a[101];

int main()  {
  int n, d, m, cnt = 0;
  cin >> n;

  for (int i = 0; i < n; ++i) {
    cin >> a[i];
  }
  cin >> d >> m;

  for (int i = 0; i < (n - m + 1); ++i) {
    int sum = 0;
    for (int j = i; j < (i + m); ++j) {
      // cout << a[j] << " ";
      sum += a[j];
    }
    // cout << endl << "S: " << sum << endl;
    if (sum == d) {
      cnt++;
    }
  }

  cout << cnt << endl;
  return 0;
}
