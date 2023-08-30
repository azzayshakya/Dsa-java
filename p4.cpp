// 5 4 3 2 1 
// 5 4 3 2 1 
// 5 4 3 2 1 
// 5 4 3 2 1 
// 5 4 3 2 1 


#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    int i=1;
    
    while(i<=n){
        int j =n;
        while(j>=1){
            cout<<j<<" ";
            j=j-1;
        }
        cout<<endl;
        i=i+1;
    }
    
    return 0;
}