#include <bits/stdc++.h>
using namespace std;

int a[1000001];

int main()  {
    string s, r = "XXXXXXXX", l = "XX";
    int k = 1, n;
    cin >> s;

    if (s[8] == 'A') {
      if (s[0] == '1' && s[1] == '2') {
        r[0] = '0';
        r[1] = '0';
        for (int i = 2; i < int(s.length()) - 2; i++) {
            r[i] = s[i];
        }
        cout << r << endl;
      }
      else {
        for (int i = 0; i < int(s.length()) - 2; i++) {
            r[i] = s[i];
        }
        cout << r << endl;
      }
    }
    else {
      l[0] = s[0];
      l[1] = s[1];
      stringstream ss;
      ss << l;
      ss >> n;

      if (n < 8) {
        stringstream ss;
        ss << (n + 2);
        ss >> l;
        r[0] = '1';
        r[1] = l[0];
      }
      else if (n >= 8 && n < 12) {
        stringstream ss;
        ss << (n + 12);
        ss >> l;
        r[0] = l[0];
        r[1] = l[1];
      }
      else if (n == 12) {
        for (int i = 0; i < int(s.length()) - 2; i++) {
            r[i] = s[i];
        }
        cout << r << endl;
        k = 0;
      }
      if (k == 1) {
        for (int i = 2; i < int(s.length()) - 2; i++) {
            r[i] = s[i];
        }
        cout << r << endl;
      }
      // cout << a << endl;
      // if ((s[0] == '1' && s[1] == '0') || )
    }

    return 0;
}
