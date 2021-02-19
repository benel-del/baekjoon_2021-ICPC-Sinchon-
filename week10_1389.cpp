// no.1389 케빈 베이컨의 6단계 법칙 - submit_no.26535747

#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int cost[101][101];
vector<int> q[101];
int main()
{
    int n, m;
    cin >> n >> m;

    fill(&cost[1][1], &cost[n+1][n+1], 1e7);
    int a, b;
    while(m--){
        cin >> a >> b;
        q[a].push_back(b);
        q[b].push_back(a);
        cost[a][b] = cost[b][a] = 1;
    }

    for(int i = 1; i <= n; i++)
        cost[i][i] = 0;

    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            for(int k = 1; k <= n; k++){
                cost[j][k] = min(cost[j][k], cost[j][i] + cost[i][k]);
            }
        }
    }

    int cnt[n+1];
    for(int i = 1; i <= n; i++){
        int sum = 0;
        for(int j = 1; j <= n; j++){
            sum += cost[i][j];
        }
        cnt[i] = sum;
    }
    cout << min_element(&cnt[1], &cnt[n+1]) - cnt;
    
    return 0;
}
