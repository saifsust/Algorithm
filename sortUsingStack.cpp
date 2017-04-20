#include<bits/stdc++.h>
using namespace std;
typedef stack<int> si;
int main() {
    si s2,s1;
    freopen("inOut/in.txt","r",stdin);
    int size,num;
    cin>>size;
    for(int i=0; i<size; ++i) {
        cin>>num;
        s1.push(num);
    }
    s2.push(s1.top());
    s1.pop();
    while(!s1.empty()) {
        int min= s1.top();
        s1.pop();
       // cout<<"ok Done "<<min<<" "<<s2.top()<<endl;
        while(min>s2.top()) {
            int u=s2.top();
            s1.push(u);
            s2.pop();
            if(s2.empty()) break;
        }
        s2.push(min);
    }
    while(!s2.empty()) {
        cout<<s2.top()<<" ";
        s2.pop();
    }

}
