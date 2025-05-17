package Day07;


class Solution {
    
    // Heapify function to maintain the max-heap property
    private void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;  // Left child index
        int right = 2 * i + 2; // Right child index

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            // Swap arr[i] and arr[largest]
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Function to build a Max Heap from the array
    private void buildHeap(int arr[], int n) {
        // Index of last non-leaf node
        int startIdx = (n - 1) / 2;

        // Perform reverse level order traversal from last non-leaf node
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Function to sort an array using Heap Sort
    public void heapSort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        buildHeap(arr, n);

        // One by one extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
}
