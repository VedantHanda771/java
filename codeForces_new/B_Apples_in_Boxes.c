#include <stdio.h>
#include <stdint.h>
#include <inttypes.h>
#include <limits.h>

int main(void) {
    int t;
    if (scanf("%d", &t) != 1) return 0;
    while (t--) {
        int n;
        int64_t k;
        scanf("%d %" SCNd64, &n, &k);
        int64_t mn = LLONG_MAX;
        int64_t mx = LLONG_MIN;
        int64_t sum = 0;
        for (int i = 0; i < n; i++) {
            int64_t a;
            scanf("%" SCNd64, &a);
            if (a < mn) mn = a;
            if (a > mx) mx = a;
            sum += a;
        }
        if (mx - mn > k) {
            printf("Jerry\n");
        } else {
            if (sum & 1) printf("Tom\n");
            else printf("Jerry\n");
        }
    }
    return 0;
}