// repeating and missng element



#include <iostream>
using namespace std;

int RepeatAndMising(int arr[] ,int n){
    int a,b;
    for(int i =0;i<n;i++){
        if(arr[abs(arr[i])-1]<0){
            a=abs(arr[i]);
        }
        
    else {
        arr[abs(arr[i])-1]=-arr[abs(arr[i])-1];
    }
    }
    
    for (int i=0;i<n;i++){
        if(arr[i]>0){
            b=i+1;
            break;
        
    }
}
cout<<"reapating element is "<<a<<" and the missing element is "<<b;
}


int main() {
   
    int arr[] ={3,1,2,5,3};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    RepeatAndMising(arr,n);
    
     

    return 0;
}