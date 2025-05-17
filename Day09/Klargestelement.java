package Day09;

class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            maxHeap.add(num);
        }
        for (int i = 0; i < k; i++) {
            result.add(maxHeap.poll());
        }

        return result;
    }
}