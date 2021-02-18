// no.1865 웜홀 - submit_no.26522800

#include <iostream>
#include <vector>
using namespace std;

int main()
{
    int tc, n, m, w, s, e, t;
    cin >> tc;
    while(tc--){
        long long tt[501];
        vector<pair<int, int>> q[501];
        cin >> n >> m >> w;
        while(m--){
            cin >> s >> e >> t;
            q[s].push_back({e, t});
            q[e].push_back({s, t});
        }
        while(w--){
            cin >> s >> e >> t;
            q[s].push_back({e, -t});
        }
        
        bool cycle = false;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 0; k < q[j].size(); k++){
                    if(tt[q[j][k].first] > tt[j] + q[j][k].second){
                        if(i == n-1)    cycle = true;
                        tt[q[j][k].first] = tt[j] + q[j][k].second;
                    }
                }
            }
        }
        if(cycle)
            cout << "YES\n";
        else
            cout << "NO\n";
    }
    
    return 0;
}
