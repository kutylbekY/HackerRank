#include <bits/stdc++.h>
using namespace std;

long long a[1000001], s[100001];

int main()  {
    long long max = -999999999999, min = 999999999999;

    for (int i = 0; i < 5; i++) {
        cin >> a[i];
    }
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
          s[i] += a[j];
        }
        s[i] -= a[i];
    }
    for (int i = 0; i < 5; i++) {
        // cout << s[i];
        if (s[i] > max) {
          max = s[i];
        }
        if (s[i] < min) {
          min = s[i];
        }
    }

// -1 -2 -2 -3 -4
    cout << min << " " << max << endl;
    return 0;
}
