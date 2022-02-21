#include <bits/stdc++.h>
using namespace std;

int a[101], b[101], r[2];

int main()  {

    for (int i = 0; i < 3; i++) {
      cin >> a[i];
    }
    for (int i = 0; i < 3; i++) {
      cin >> b[i];
    }
    for (int i = 0; i < 3; i++) {
      if (a[i] > b[i]) {
        r[0]++;
      }
      else if (b[i] > a[i]){
        r[1]++;
      }
    }
    for (int i = 0; i < 2; i++) {
      cout << r[i] << " ";
    }

    return 0;
}
