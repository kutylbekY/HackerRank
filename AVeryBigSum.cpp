#include <bits/stdc++.h>
using namespace std;

int main()  {
    int n;
    long long sum = 0, c;
    cin >> n;

    for (int i = 0; i < n; i++) {
      cin >> c;
      sum += c;
    }

    cout << sum << endl;
    return 0;
}
