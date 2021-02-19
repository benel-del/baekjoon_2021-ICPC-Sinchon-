// no.20046 플로이드 - submit_no.26532209

#include <iostream>
using namespace std;

int cost[101][101];
int main()
{
    int n, m;
    cin >> n >> m;
    
    fill(&cost[1][1], &cost[n+1][n+1], 1e7);
    for(int i = 1; i <= n; i++)
        cost[i][i] = 0;
    
    int a, b, c;
    while(m--){
        cin >> a >> b >> c;
        cost[a][b] = min(cost[a][b], c);
    }

    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            for(int k = 1; k <= n; k++){
                cost[j][k] = min(cost[j][k], cost[j][i] + cost[i][k]);
            }
        }
    }

    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            if(cost[i][j] == 1e7)
                cout << 0 << ' ';
            else
                cout << cost[i][j] << ' ';
        }
        cout << endl;
    }
    
    return 0;
}
