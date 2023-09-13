//To get Min max


#include <iostream>
using namespace std;
void minmax(int arr[] , int n){
    int min =arr[0];
     int max =arr[0];
    
     if(n==1){
         min=arr[0];
         max=arr[0];
         cout<<min<<"is minimum"<<endl;
         cout<<max<<"is maximum"<<endl;
     }
     else{
         for(int i=0;i<n;i++){
             
             if(arr[i]>max){
             max=arr[i];
             }
             else if(arr[i]<min){
                 min=arr[i];
             }
             
             
         }
         cout<<min<<"is minimum"<<endl;
         cout<<max<<"is maximum"<<endl;
     }
}
int main() {
   int arr[] ={12,431,5432,12,425,11,2341,42};
   int arrsize =8;
  minmax(arr , arrsize);

    return 0;
}