// next pernutation


#include <bits/stdc++.h>
using namespace std;
int nextpermutataion (int arr[],int n){
    
    int ind =-1;
    int n =sizeof(arr);
    for (int i =n-2;i>=0;i--){
        if(arr[i]<arr[i+1]){
            ind =i;
            break;
            
        }
        
    }
if(ind==-1){
    reverse(arr[0],arr[n-1]);
    cout<<arr;
}    
for(int i =n-1;i>ind;i--){
    if(arr[i]>arr[ind]){
        swap(arr[i],arr[ind]);
        break;
    }
}
reverse(arr[0]+ind +1,arr[n-1]);
cout<<arr;
}

int main()
{
    int arr[] = {2,1,5,4,3,0,0};
    int n =sizeof(arr);
    nextpermutataion(arr,n);
    
  
 
    return 0;
}

