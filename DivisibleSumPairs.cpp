#include <bits/stdc++.h>
using namespace std;

int a[101];

int main()  {
  int n, k, cnt = 0;
  cin >> n >> k;

  for (int i = 0; i < n; ++i) {
    cin >> a[i];
  }

  for (int i = 0; i < n; ++i) {
    for (int j = i + 1; j < n; ++j) {
      if ((a[i] + a[j]) % k == 0) {
        cnt++;
      }
    }
  }



  cout << cnt << endl;
  return 0;
}
