// no.1753 최단경로 - submit_no.26464001

#include <iostream>
#include <queue>
#include <vector>
using namespace std;

priority_queue<pair<long, long>, vector<pair<long, long>>, greater<>> pq;
const long n = 20202, inf = 1e18;
int V, E, K;
long d[n];
vector<pair<long, long>> vv[n];

int main()
{
    cin >> V >> E >> K;
    int u, v, w;
    while(E--){
        cin >> u >> v >> w;
        vv[u].push_back({v, w});
    }
    fill(d, d + V + 1, inf);
    d[K] = 0;
    pq.push({0, K});
    
    while(pq.size()){
        auto cur = pq.top(); pq.pop();
        if(d[cur.second] < cur.first)   continue;
        for(auto nxt : vv[cur.second]){
            if(d[nxt.first] <= cur.first + nxt.second)  continue;
            d[nxt.first] = cur.first + nxt.second;
            pq.push({d[nxt.first], nxt.first});
        }
    }
    
    for(int i = 1; i <= V; i++){
        if(d[i] == inf)
            cout << "INF\n";
        else cout << d[i] << '\n';
    }
    return 0;
}
