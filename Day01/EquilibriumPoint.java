class Solution {
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        long total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }

        long curr = 0;

        for (int i = 0; i < n; i++) {
            if (curr == total - curr - arr[i]) {
                return i;
            }
            curr += arr[i];
        }

        return -1;
    }
}
