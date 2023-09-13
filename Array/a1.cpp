// rotate the array;


#include <iostream>
using namespace std;


string reverseStr(string str)
{
	int n = str.length();

	for (int i = 0; i < n / 2; i++){
		swap(str[i], str[n - i - 1]);
    }
    return str;
}


int main()
{
	string str = "ajay";
	reverseStr(str);
	cout << str;
	return 0;
}
