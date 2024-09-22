#include <bits/stdc++.h>
using namespace std;
 
typedef long long ll;
typedef pair<int, int> pii;
 
#define f first
#define s second
#define all(x) (x).begin(), (x).end()
#define tc int tc;cin >> tc; while(tc--) 
 
const int N = 2e5 + 5;
ll n, m, a[N], w, k;
vector <ll> ans;
string v;

int main() {
	ios:: sync_with_stdio(0), cin.tie(0), cout.tie(0);
tc {	
	cin >> n >> m >> k >> w;
	for (int i = 0; i < w; i++)
		cin >> a[i];
	for (ll i = 0; i < n; i++)
		for (ll j = 0; j < m; j++) 
			ans.push_back((k - max(k - i - 1, 0ll) - max(k - (n - i), 0ll)) * (k - max(k - j - 1, 0ll) - max(k - (m - j), 0ll)));
	sort(all(ans), greater<ll>());
	sort(a, a + w, greater<ll>());
	ll res = 0;
	for (int i = 0; i < w; i++) {
		//cout << ans[i] << ' ';
		res += ans[i] * a[i];
	}
	ans.clear();
	cout << res << '\n';
}}