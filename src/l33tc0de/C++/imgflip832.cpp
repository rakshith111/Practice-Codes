#include <bits/stdc++.h>
using namespace std;

// Driver Code
int main()
{
    vector<vector<int>> arr = {{1,1,0},{1,0,1},{0,0,0}};
    for (auto& it : arr) {
        reverse(it.begin(),it.end());
    }

    for (auto& it : arr) {
        int sizee=it.size();
        for (int i = 0; i < sizee; i++){
            it.at(i)=(it.at(i)) ? 0 : 1;

        }
    }


    return 0;
}