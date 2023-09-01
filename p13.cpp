// A B C 
// D E F 
// G H I 
// J K L 



#include <iostream>
using namespace std;
int main() {
    int n;
    cin>>n;
    int i;
    char start ='A';
    while(i<=n){
        int j=1; 
        while(j<=n){
            cout<<start<<" ";
            start= start+1;
            j=j+1;
        }
        cout<<endl;
        i=i+1;

    }

    return 0;
}