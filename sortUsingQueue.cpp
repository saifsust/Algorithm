#include<bits/stdc++.h>
using namespace std;
typedef queue<int>qi;
int main() {
    int size,num;
    qi q1,q2,q3;
    freopen("inOut/in.txt","r",stdin);
    cin>>size;
    for(int i=0; i<size; ++i) {
        cin>>num;
        q1.push(num);
    }
    int min,fnt;
    while(!q1.empty()) {
        //cout<<"ok Done"<<endl;
        min=q1.front();
        q1.pop();
        while(!q1.empty()) {
            q2.push(q1.front());
            q1.pop();
        }
        while(!q2.empty()) {
            if(min>q2.front()) {
                q1.push(min);
                min=q2.front();
                q2.pop();
            } else {
                q1.push(q2.front());
                q2.pop();
            }
        }
        //cout<<min<<endl;
        q3.push(min);
    }

    while(!q3.empty()) {
        cout<<q3.front()<<" ";
        q3.pop();
    }


    return 0;
}
