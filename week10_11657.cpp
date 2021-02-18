// no.20046 타임머신 - submit_no.26522454

#include <iostream>
#include <vector>
using namespace std;

long long t[501];
vector<pair<long long,long long>> q[501];
int main()
{
    int n, m;
    cin >> n >> m;
    
    fill(&t[1], &t[n+1], 1e7);
    
    long long a, b, c;
    while(m--){
        cin >> a >> b >> c;
        q[a].push_back({b, c});
        if(a == 1)
            t[b] = c;
    }
    t[1] = 0;
    bool cycle = false;
    for(int i = 0; i < n; i++){
        for(int j = 1; j <= n; j++){
            if(t[j] == 1e7) continue;
            for(int k = 0; k < q[j].size(); k++){
                if(t[q[j][k].first] > t[j] + q[j][k].second){
                    if(i == n-1)    cycle = true;
                    t[q[j][k].first] = t[j] + q[j][k].second;
                }
            }
        }
    }
    
    if(cycle)
        cout << -1;
    else{
        for(int i = 2; i <= n; i++){
            if(t[i] == 1e7)
                cout << -1 << endl;
            else
                cout << t[i] << endl;
        }
    }
    
    return 0;
}
