// no. 1967 트리의 지름 - submit_no.26291812

#include <iostream>
using namespace std;

typedef struct node{
    int pos;
    int w;
    struct node *next;
} node;

void insert(int, int, int);
void func(int, int, int);
node *graph[100000];
int pos, mx = 0;

int main()
{
    int n;
    cin >> n;
    if(n != 1){
        int node1, node2, w;
        
        for(int i = 1; i <= n; i++){
            cin >> node1 >> node2 >> w;
            insert(node1, node2, w);
            insert(node2, node1, w);
        }
    
        func(1, 0, -1);
        //cout << "mx:" << mx << ", pos:" << pos << endl;
        mx = 0;
        func(pos, 0, -1);
    }
    cout << mx << endl;
    return 0;
}

void func(int cur, int w, int pre){
    //cout << pre << "->" << cur << ": mx: " << mx << endl;
    if(mx < w){
        mx = w;
        pos = cur;
    }
    int next, d;
    node *p = graph[cur];
    while(p){
        next = p->pos;
        d = p->w;
        if(next != pre)
            func(next, w + d, cur);
        p = p->next;
    }
}

void insert(int a, int b, int w){
    node *p, *q, *temp;
    p = graph[a];
    while(p){
        q = p; p = p->next;
    }
    temp = (node *)malloc(sizeof(node));
    temp->pos = b;
    temp->w = w;
    temp->next = NULL;
    if(!graph[a])  graph[a] = temp;
    else q->next = temp;
}
