package Day03;

class Solution {
    public int findMaximum(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            // To handle edge cases when mid is at the boundaries
            if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return arr[mid];
                } else if (arr[mid] > arr[mid - 1] && arr[mid + 1] > arr[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else if (mid == 0) {
                return Math.max(arr[0], arr[1]);
            } else if (mid == n - 1) {
                return Math.max(arr[n - 1], arr[n - 2]);
            }
        }

        return -1; 
    }
}
