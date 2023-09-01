// XXXX
// XXX
// XX
// X


#include <iostream>
using namespace std;
int main() {
    int n;
    cin>>n;
    
    int i =1;
    while(i<=n){
        
        int space=n-i+1;
        while(space){
            cout<<"X"<<" ";
            space=space-1;
        }
       
        i=i+1;
        cout<<endl;
        
    }
    return 0;
}