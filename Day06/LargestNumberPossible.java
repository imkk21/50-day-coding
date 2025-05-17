package Day06;

class Solution {
    static String findLargest(int n, int s) {
        StringBuilder sum = new StringBuilder();
        int pos = s;
        int pos1 = 0;

        if (n > 1 && s == 0) {
            return "-1";
        } else if (n == 1 && s == 0) {
            return "0";
        } else {
            while (sum.length() < n) {
                if (s >= 9) {
                    s -= 9;
                    pos1 += 9;
                    sum.append('9');
                } else {
                    pos1 += s;
                    sum.append(s);
                    s = 0;
                }
            }
        }

        if (pos1 == pos)
            return sum.toString();
        else
            return "-1";
    }
}
