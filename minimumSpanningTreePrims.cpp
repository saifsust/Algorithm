#include<bits/stdc++.h>
#define sf scanf
#define pf printf
using namespace std;
/*
* saif_sust_2013331007
* saiful.sust.cse@gmail.com
*/
/*
* Minimum Spanning Tree
*/
const int inf = 1e8;
const int N = 1000;
struct pq {
    int node,cost;
    bool operator<(const pq &n) const {
        return cost>n.cost;
    }
};
int minCost;
bool visited[N];
void reset(int N) {
    for(int i=1; i<=N; i++)
        visited[i]=false;
}
int prims(vector<pq>*GRAPH,int N) {
    priority_queue<pq>Q;
    reset(N);
    pq node;
    node.node=1;
    node.cost=0;
    Q.push(node);
    while(!Q.empty()) {
        node=Q.top();
        Q.pop();
        if(visited[node.node]) continue;
        minCost+=node.cost;
        visited[node.node]=true;
        for(int i=0; i<GRAPH[node.node].size(); i++) {
            pq y= GRAPH[node.node][i];
            if(!visited[y.node]) {
                Q.push(y);
            }
        }
    }
    return minCost;

}
int main() {

    freopen("inOut/in.txt","r",stdin);
    //freopen("inOut/out.txt","w",stdout);

    pq m;
    int numOfEdge,u,v,cost,numVertex;
    sf("%d%d",&numVertex,&numOfEdge);
    vector<pq>GRAPH[numVertex+2];
    for(int i=0; i<numOfEdge; i++) {
        sf("%d%d%d",&u,&v,&cost);
        m.node=v;
        m.cost=cost;
        GRAPH[u].push_back(m);
        m.node=u;
        GRAPH[v].push_back(m);
    }
    pf("%d\n",prims(GRAPH,numVertex));
    return 0;
}
