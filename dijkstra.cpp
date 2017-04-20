#include<bits/stdc++.h>
using namespace std;
#define sf scanf
#define pf printf
const int inf = 1e8;
const int N=1000;
int dist[N+50];
/*
*   saif_sust_2013331007
*
*/
struct nodeCostPair {
    int cost,node;
    bool operator<( const nodeCostPair &next)const {
        return cost>next.cost;
    }
};
vector<nodeCostPair>GRAPH[N];
void reset() {
    for(int i=0; i<=N; i++) dist[i]=inf;
}
int dijkstra(int source,int destination) {
    priority_queue<nodeCostPair>Q;
    reset();
    dist[source]=0;
    nodeCostPair u;
    u.cost=0;
    u.node= source;
    Q.push(u);
    while(!Q.empty()) {
        nodeCostPair parent =Q.top();
        Q.pop();
        cout<<parent.node<<" ";
        for(int i=0; i<GRAPH[parent.node].size(); i++) {
            nodeCostPair child=GRAPH[parent.node][i];
            int dn=dist[parent.node]+child.cost;
            if(dn<dist[child.node]) {
                dist[child.node]=dn;
                Q.push(child);
            }

        }

    }
    cout<<endl;
    return dist[destination];
}

int main() {

    freopen("inOut/in.txt","r",stdin);
    //freopen("inOut/out.txt","W",stdout);
    nodeCostPair m;
    int numOfNode,numOfEdge,u,v,cost;
    cin>>numOfEdge;
    for(int i=0; i<numOfEdge; i++) {
        cin>>u>>v>>cost;
        m.node=v;
        m.cost=cost;
        GRAPH[u].push_back(m);
    }

    int source,destination;
    cin>>source>>destination;
    cout<<dijkstra(source,destination)<<endl;

    return 0;
}
