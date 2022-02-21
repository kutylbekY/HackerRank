#include <bits/stdc++.h>
using namespace std;

int main()  {
  int s, t, a, b, n, m, ac = 0, oc = 0;
  cin >> s >> t >> a >> b >> n >> m;
  int q[n], o[m]; // used too small arrays, resulted in runtime error

  for (int i = 1; i <= n; ++i) {
    cin >> q[i];
    int range = q[i] + a;
    if (range >= s && range <= t) {
      ac++;
    }
  }
  for (int i = 1; i <= m; ++i) {
    cin >> o[i];
    int range = o[i] + b;
    if (range >= s && range <= t) {
      oc++;
    }
  }

  cout << ac << endl << oc << endl;
  return 0;
}
