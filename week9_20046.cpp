// no.20046 Road Reconstruction - submit_no.26469625

#include <iostream>
#include <queue>
#include <vector>
#include <tuple>
using namespace std;

// <x, y, w> 
typedef tuple <int, int, int> tp;
struct cmp{
    bool operator()(tp a, tp b){
        return get<2>(a) > get<2>(b);
    }
};
priority_queue<tp, vector<tp>, cmp> pq;
const int n = 1002, inf = 1e7;
int N, M;
int city[n][n], d[n][n];
vector<pair<int, int>> v[n][n];

int main()
{
    cin >> M >> N;
    
    for(int i = 1; i <= M; i++){
        for(int j = 1; j <= N; j++)
            cin >> city[i][j];
        city[i][N+1] = -1;
    }
    for(int i = 1; i <= M; i++){
        for(int j = 1; j <= N; j++){
            v[i][j].push_back({i-1, j});
            v[i][j].push_back({i, j-1});
            v[i][j].push_back({i+1, j});
            v[i][j].push_back({i, j+1});
        }
    }
    fill(&city[M+1][0], &city[M+1][N+1], -1);
    fill(&d[1][1], &d[M+1][N+1], inf);

    pq.push({1, 1, city[1][1]});
    if(city[1][1] != -1){
        while(pq.size()){
            auto cur = pq.top(); pq.pop();
            if(get<0>(cur) == M && get<1>(cur) == N)   break;
            for(auto nxt : v[get<0>(cur)][get<1>(cur)]){
                if(nxt.first == 0 || nxt.second == 0)   continue;
                if(city[nxt.first][nxt.second] == -1)   continue;
                if(d[nxt.first][nxt.second] <= get<2>(cur) + city[nxt.first][nxt.second]) continue;
                d[nxt.first][nxt.second] = get<2>(cur) + city[nxt.first][nxt.second];
                pq.push({nxt.first, nxt.second, d[nxt.first][nxt.second]});
            }
        }
    }

    if(d[M][N] == inf)
        cout << -1;
    else
        cout << d[M][N];
    return 0;
}
