// no.1916 최소비용 구하기 - submit_no.26464587

#include <iostream>
#include <queue>
#include <vector>
using namespace std;

priority_queue<pair<long, long>, vector<pair<long, long>>, greater<>> pq;
const long n = 10202, inf = 1e18;
int N, M, str, des;
long d[n];
vector<pair<long, long>> vv[n];

int main()
{
    cin >> N >> M;
    int u, v, w;
    while(M--){
        cin >> u >> v >> w;
        vv[u].push_back({v, w});
    }
    fill(d, d + N + 1, inf);
    
    cin >> str >> des;
    d[str] = 0;
    pq.push({0, str});
    
    while(pq.size()){
        auto cur = pq.top(); pq.pop();
        if(cur.second == des)   break;
        if(d[cur.second] < cur.first)   continue;
        for(auto nxt : vv[cur.second]){
            if(d[nxt.first] <= cur.first + nxt.second)  continue;
            d[nxt.first] = cur.first + nxt.second;
            pq.push({d[nxt.first], nxt.first});
        }
    }

    cout << d[des];
    return 0;
}
