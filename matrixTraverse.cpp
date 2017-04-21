#include<bits/stdc++.h>
#define sf scanf
#define pf printf
using namespace std;
const int inf = 1e8;
const int N = 100;
const int M=100;
int matrix[N][M];
bool visited[N][M];
int nx,my;
int counter,maxOne;
vector<pair<int,int> >path,backUpPath;
void pathPrint();
void printMatrix();
int horizontalVisit();
int verticalVisit();
int diagonalVisit();
void Set() {
    memset(visited,false,sizeof(visited));
}
void maxOneCounter(int sx,int sy,int x,int y) {
    visited[sy][sx]=true;
    ///cout<<sx<<" "<<sy<<endl;
    backUpPath.push_back(make_pair(sx,sy));
    counter+=matrix[sy][sx];
    int xx = x+sx;
    int yy = y+sy;
    if(xx>=0 && xx<nx && yy>=0 && yy<my) {
        if(visited[yy][xx]==false) {
            maxOneCounter(xx,yy,x,y);
        }
    }
}
/*
*  vertical Visit Function
*/
int verticalVisit() {
    const int x=0,y=1;
    Set();
    maxOne=0;
    backUpPath.clear();
    path.clear();
    for(int i=0; i<nx; i++) {
        counter=0;
        backUpPath.clear();
        maxOneCounter(i,0,x,y);
        if(maxOne<counter) {
            maxOne=counter;
            path.clear();
            for(int j=0; j<backUpPath.size(); j++) {
                path.push_back(backUpPath[j]);
            }
        }
    }
    cout<<"Vertical VISIT :"<<endl;
    pathPrint();

    return maxOne;
}
/*
*  Horizontal Visit Function
*/
int horizontalVisit() {
    const int x=1, y=0;
    Set();
    maxOne=0;
    backUpPath.clear();
    path.clear();
    for(int i=0; i<my; i++) {
        counter=0;
        backUpPath.clear();
        maxOneCounter(0,i,x,y);
        if(counter>maxOne) {
            maxOne=counter;
            path.clear();
            for(int j=0; j<backUpPath.size(); j++) {
                path.push_back(backUpPath[j]);
            }
        }
    }
    cout<<" Horizontal Visit "<<endl;
    pathPrint();
    return maxOne;
}
void pathPrint() {
    cout<<"Maximum One ";
    cout<<maxOne<<endl;
    cout<<"Path "<<endl;
    for(int i=0; i<path.size(); i++) {
        cout<<path[i].first<<" "<<path[i].second<<endl;
    }
    cout<<endl;
}
void printMatrix() {
    for(int i=0; i<my; i++) {
        for(int j=0; j<nx; j++) {
            cout<<matrix[i][j]<<" ";
        }
        cout<<endl;
    }
}
/*
* Diagonal Visit Function
*/
int diagonalVisit() {
    const int x=1,y=1;
    Set();
    maxOne=0;
    backUpPath.clear();
    path.clear();
    for(int i=0; i<nx; ++i) {
        counter=0;
        backUpPath.clear();
        maxOneCounter(i,0,x,y);
        if(maxOne<counter) {
            maxOne=counter;
            path.clear();
            for(int j=0; j<backUpPath.size(); ++j) {
                path.push_back(backUpPath[j]);
            }
        }
    }
    for(int i=0; i<my; ++i) {
        counter=0;
        backUpPath.clear();
        maxOneCounter(0,i,x,y);
        if(maxOne<counter) {
            maxOne=counter;
            path.clear();
            for(int j=0; j<backUpPath.size(); ++j) {
                path.push_back(backUpPath[j]);
            }
        }
    }
    cout<<"Diagonal Visit"<<endl;
    pathPrint();

}
int main() {
    freopen("inOut/in.txt","r",stdin);
    cin>>my>>nx;
    for(int i=0; i<my; i++) {
        for(int j=0; j<nx; j++) {
            cin>>matrix[i][j];
        }
    }
    printMatrix();
    horizontalVisit();
    verticalVisit();
    diagonalVisit();
    return 0;
}
