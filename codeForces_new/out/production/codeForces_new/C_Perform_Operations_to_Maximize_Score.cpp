#include <bits/stdc++.h>

using namespace std;

void solve() {
    int numPairs, offset; 
    cin >> numPairs >> offset;
    
    vector<pair<int, int>> pairs(numPairs);
    
    // Read the first and second values of each pair
    for (auto& p : pairs) {
        cin >> p.first;
    }
    for (auto& p : pairs) {
        cin >> p.second;
    }
    
    // Sort pairs based on the first value
    sort(pairs.begin(), pairs.end());
 
    int medianIndex = (numPairs - 1) / 2;
    int64_t maxSum = LLONG_MIN;
    
    for (int i = 0; i < numPairs; ++i) {
        if (pairs[i].second == 1) {
            // Ensure medianIndex is valid
            if (medianIndex < numPairs) {
                maxSum = max(maxSum, static_cast<int64_t>(pairs[i].first) + offset + pairs[medianIndex].first);
            }
        } else {
            // Ensure medianIndex - 1 is valid
            if (medianIndex - 1 >= 0) {
                maxSum = max(maxSum, static_cast<int64_t>(pairs[i].first) + pairs[medianIndex - 1].first);
            }
        }
    }
    
    cout << maxSum << endl;
}

int main() {
    ios::sync_with_stdio(false); // For faster I/O
    cin.tie(nullptr); // To avoid synchronization issues between cin and cout
    
    int testCases; 
    cin >> testCases;
    while (testCases--) {
        solve();
    }
    return 0;
}
