// AAAAA
// BBBBB
// CCCCC
// DDDDD
// EEEEE


#include <iostream>
using namespace std;
int main() {
    int n;
    cin>>n;
    int i;
    while(i<=n){
        int j=1;
        while(j<=n){
            char ch ='A' + i - 1;
            cout<<ch;
            j=j+1;
        }
        cout<<endl;
        i=i+1;

    }

    return 0;
}