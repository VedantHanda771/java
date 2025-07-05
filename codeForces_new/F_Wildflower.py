import sys
sys.setrecursionlimit(10**7)
input = sys.stdin.readline

MOD = 10**9 + 7

def modexp(a, e=1, mod=MOD):
    res = 1
    while e:
        if e & 1:
            res = (res * a) % mod
        a = (a * a) % mod
        e >>= 1
    return res

def solve():
    t = int(input())
    for _ in range(t):
        n = int(input())
        g = [[] for _ in range(n+1)]
        for _ in range(n-1):
            u,v = map(int, input().split())
            g[u].append(v)
            g[v].append(u)

        # Build rooted tree at 1
        parent = [0]*(n+1)
        children = [[] for _ in range(n+1)]
        parent[1] = -1
        stack = [1]
        order = []
        while stack:
            u = stack.pop()
            order.append(u)
            for w in g[u]:
                if parent[w]==0:
                    parent[w]=u
                    children[u].append(w)
                    stack.append(w)

        # Compute subtree sizes bottom-up
        size = [1]*(n+1)
        for u in reversed(order):
            for w in children[u]:
                size[u] += size[w]

        ok = True
        # Check each node
        for u in range(1, n+1):
            c = children[u]
            if len(c) >= 3:
                ok = False
                break
            if len(c) == 2:
                # must split equally
                if size[c[0]] != size[c[1]]:
                    ok = False
                    break
            # len(c)==0 or 1 always fine

        if not ok:
            print(0)
        else:
            # Every labeling works
            print(modexp(2, n))

if __name__ == "__main__":
    solve()