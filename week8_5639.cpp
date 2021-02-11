// no. 5639 이진 검색 트리 - submit_no.26291344

#include <iostream>
using namespace std;

typedef struct node{
    int key;
    struct node *left;
    struct node *right;
} node;

void VLR(node* p);

int main()
{
    int c;
    node *root = NULL;
    node *p, *q;
    while(cin >> c){
        p = root;
        while(p){
            q = p;
            if(c < p->key)  p = p->left;
            else    p = p->right;
        }
        
        node *temp = (node *)malloc(sizeof(node));
        temp->key = c;
        temp->left = temp->right = NULL;
        
        if(!root)  root = temp;
        else if(c < q->key) q->left = temp;
        else q->right = temp;
    }
    VLR(root);
    
    return 0;
}

void VLR(node* p){
    if(p){
        VLR(p->left);
        VLR(p->right);
        cout << p->key << endl;
    }
}
