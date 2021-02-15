// no. 11286 절댓값 힙 - submit_no.26408584

#include <iostream>
#include <queue>
using namespace std;

struct cmp{
    bool operator()(long long x, long long y){
        if(abs(x) == abs(y))
            return x > y;
        return abs(x) > abs(y);
    }
};
priority_queue<long long, vector<long long>, cmp> pq;

int main()
{
    int n, x;
    cin >> n;
    while(n--){
        cin >> x;
        if(x)
            pq.push(x);
        else{
            if(pq.empty())
                cout << "0" << endl;
            else{
                cout << pq.top() << "\n";
                pq.pop();
            }
        }
    }
    return 0;
}
