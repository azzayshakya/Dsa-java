// buy and  sell stocks

#include <bits/stdc++.h>
using namespace std;

int buyandsell(int prices[] , int n){
    int mini=prices[0];
    int maxi=0;
     
    for(int i=1;i<n;i++){
        int profit =prices[i] - mini;
        maxi=max(profit,maxi);
        mini=min(prices[i],mini);
         
    }
    cout<<maxi;
 }


int main() {
   
    int prices[] ={7,1,5,3,6,4};
    int n = sizeof(prices) / sizeof(prices[0]);
    
    buyandsell(prices,n);
    
     

    return 0;
}