// no.11403 경로 찾기 - submit_no.26536056

#include <iostream>
using namespace std;

int cost[101][101];
int main()
{
    int n;
    cin >> n;

    int a;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            cin >> a;
            if(a == 0)  a = 1e7;
            cost[i][j] = a;
        }
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
            if(cost[i][j] != 1e7)
                cout << 1 << ' ';
            else
                cout << 0 << ' ';
        }
        cout << endl;
    }
    return 0;
}
