#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    vector<string>ans;
    for(int i=0;i<n;i++)
    {
        string s;
        cin>>s;
        if(s.length()<10)
        {
            ans.push_back(s);
        }
        else{
            string n="";
            n.push_back(s[0]);
            string p=to_string(s.length()-2);
            n+=p;
            n.push_back(s[s.length()-1]);
            ans.push_back(n);
        }
    }
    
    for(auto i:ans)
    {
        cout<<i<<endl;
    }
}