package Day04;

class Solution {
    public void sort012(int[] arr) {
        int zero = 0, one = 0, two = 0;

        for (int num : arr) {
            if (num == 0) zero++;
            else if (num == 1) one++;
            else two++;
        }
        int index = 0;
        while (zero-- > 0) {
            arr[index++] = 0;
        }
        while (one-- > 0) {
            arr[index++] = 1;
        }
        while (two-- > 0) {
            arr[index++] = 2;
        }
    }
}