// no.4358 생태학 - submit_no.26696116

#include <iostream>
#include <map>
using namespace std;

map<string, int> dic;
int main()
{
    string word;
    
    while(getline(cin, word)){
        if(dic.find(word) != dic.end())
            dic[word]++;
        else
            dic[word] = 1;
    }
    
    double sum = 0;
    for(auto k : dic)
        sum += k.second;
    sum = sum / 100;
    cout << fixed;
    cout.precision(4);
    for(auto k : dic)
        cout << k.first << ' ' << k.second / sum << '\n';
    
    return 0;
}
