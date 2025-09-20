#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// Function to check if the given value `val` meets the criteria with vector `v` and integer `k`
bool x(int val, const vector<int>& v, int k) {
    for (int i = 0; i < v.size(); ++i) {
        int dif = val - v[i];
        int ans = dif / k;
        if (ans % 2 == 1) return false; // If ans is odd, return false
        if (val >= v[i] + ans * k && val <= v[i] + (ans + 1) * k) {
            continue; // Continue if val is within the range
        } else {
            return false; // Return false if not within the range
        }
    }
    return true; // Return true if all conditions are met
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    
    int t; 
    cin >> t; 
    
    while (t--) {
        int n, k; 
        cin >> n >> k; 
        vector<int> a(n); 
        
        for (int i = 0; i < n; ++i) {
            cin >> a[i]; 
        }
        
        sort(a.begin(), a.end()); 
        
        bool found = false; 
        
        for (int i = a[n - 1]; i <= a[n - 1] + k; ++i) {
            if (x(i, a, k)) {
                cout << i << endl; 
                found = true; 
                break; 
            }
        }
        
        if (!found) {
            cout << -1 << endl; 
        }
    }
    
    return 0;
}
