
// X X X X 
// X X X X 
// X X X X 
// X X X X 



#include <iostream>
using namespace std;
int main() {
    // Write C++ code here
    int n;
    
    cin>>n;
    int i=1;
    while(i<=n){
        int j=1;
        while(j<=n){
            cout<<"X ";
            j=j+1;
            
        }
        cout<<endl;
        i=i+1;
        
    }

    return 0;
}

