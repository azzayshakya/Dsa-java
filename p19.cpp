//         1 
//       1 2 1 
//     1 2 3 2 1 
//   1 2 3 4 3 2 1 
// 1 2 3 4 5 4 3 2 1 


#include <iostream>
using namespace std;
int main() {
    int n;
    cin>>n;
    int i=1;
    while(i<=n){
        //printing spaces
        int space = n-i;
        while(space){
            cout<<" "<<" ";
            space= space-1;
        }
        //printing 1st tringle
        int j=1;
        while(j<=i){
            cout<<j<<" ";
              j=j+1;
        }
        
        
    //     printing 2nd tringle
        int num =i-1;
        while(num){
            cout<<num<<" ";
            num=num-1;
        }
        
      cout<<endl;
      i=i+1;
    }
    
    
    return 0;
}