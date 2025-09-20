class Solution {
    // 🔹 GCD
    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // 🔹 LCM
    int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    // 🔹 Binary Search
    int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    // 🔹 Prefix Sum
    int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n+1];
        for (int i = 0; i < n; i++) {
            pref[i+1] = pref[i] + arr[i];
        }
        return pref;
    }

    // 🔹 Example placeholder (replace with contest function)
    public int exampleProblem(int[] nums) {
        // implement logic here
        return -1;
    }
}
