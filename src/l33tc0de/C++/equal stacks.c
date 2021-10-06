#include <iostream>
#include <vector>
#include <numeric>
//hacker rank prob
#include <algorithm>

using namespace std;
int arrayvectorsum(vector <int>v){
    return accumulate(v.begin(), v.end(), 0);
}
void printvec(vector<int>v){
    for(int i=0;i<v.size();i++){
        cout << " "<< v[i] ;
    }
    cout<<"\n";
}

int equaliser(vector <int > minvec ,vector <int > other,vector <int > other1) {
    int s0,s1,s2,flag,temp;
    start:
    s0 = arrayvectorsum(minvec);
    s1 = arrayvectorsum(other);
    s2 = arrayvectorsum(other1);
    cout << "\ns0=" << s0 << " s1=" << s1 << " s2=" << s2;
    cout << "\nminv :" << ' ';
    printvec(minvec);
    cout << "\nother :" << ' ';
    printvec(other);
    cout << "\nother1 :" << ' ';
    printvec(other1);
    cout << "----------------------------------------------------";
    if(s1!=s0){
        temp=other.front();
        other.erase(other.begin());
        s1 = arrayvectorsum(other);
        if(s1<s0){
            other.insert(other.begin(),temp);
            minvec.erase(minvec.begin());
            goto start;
        }
        else goto start;
    }
    if(s2!=s0&&s1==s0){
        temp=other1.front();
        other1.erase(other1.begin());
        s2 = arrayvectorsum(other);
        if(s2<s0){
            other1.insert(other1.begin(),temp);
            minvec.erase(minvec.begin());
            goto start;
        } else goto start;
    }
    return arrayvectorsum(minvec);


}




int main() {
   vector <int > h1 = {3, 2, 1, 1, 1},h2 = {4, 3, 2},h3 = {1, 1, 4, 1};
    int h1val=arrayvectorsum(h1); //8,5
    int h2val=arrayvectorsum(h2);//9,3
    int h3val=arrayvectorsum(h3);//7,4
    int minval=std::min({h1val,h2val,h3val});
    int finalsize=0;
    if(minval==0){
      finalsize=0;
    }
    else if(minval == h1val){
        finalsize=equaliser(h1,h2,h3);
    }else if (minval == h2val){
        finalsize= equaliser(h2, h1, h3);
    }
    else finalsize=equaliser(h3, h2, h1);
    cout<<"aa"<<finalsize;


    return 0;
}
