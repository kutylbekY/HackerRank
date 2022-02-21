#include <bits/stdc++.h>
using namespace std;

int a[1001];

int main()  {
    int n, c = 1;
    cin >> n;
    int k = n - 1;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < k; ++j) {
          cout << " ";
        }
        for (int j = 0; j < c; ++j) {
          cout << "#";
        }
        cout << endl;
        c++;
        k--;
    }

    return 0;
}
//      #
//     ##
//    ###
//   ####
//  #####
// ######
