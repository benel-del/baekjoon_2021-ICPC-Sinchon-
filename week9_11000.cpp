// no. 11000 강의실 배정 - submit_no.26448932

#include <iostream>
#include <queue>
using namespace std;

struct lecture{
    int s;
    int t;
    lecture(int s, int t): s(s), t(t){}
};
struct cmp1{
    bool operator()(lecture x, lecture y){
        if(x.s == y.s)
            return x.t > y.t;
        return x.s > y.s;   // up
    }
};
struct cmp2{
    bool operator()(int x, int y){
        return x > y;   // down
    }
};
priority_queue<lecture, vector<lecture>, cmp1> pq;
priority_queue<int, vector<int>, cmp2> cnt;
int main()
{
    int n, s, t;
    cin >> n;
    for(int i = 0; i < n; i++){
        cin >> s >> t;
        pq.push(lecture(s,t));
    }
    
    cnt.push(pq.top().t);  pq.pop();
    while(!pq.empty()){
        if(pq.top().s >= cnt.top()){
            //cout << pq.top().s << " " << pq.top().t << endl;
            cnt.pop();
        }
        cnt.push(pq.top().t);
        //cout << cnt.size() << " " << pq.top().s << " " << pq.top().t << endl;
        pq.pop();
        
    }

    cout << cnt.size();
    return 0;
}
