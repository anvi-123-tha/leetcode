
class Solution {
    public int arrangeCoins(int n) {
        int s = 0;
        int e = n;

        while (s <= e) {
            long m = s + (e - s) / 2;
            long sum = m * (m + 1) / 2;

            if (sum == n) {
                return (int)m;
            } else if (sum < n) {
                s = (int)m + 1;
            } else {
                e = (int)m - 1;
            }
        }

        return e;
    }
}
