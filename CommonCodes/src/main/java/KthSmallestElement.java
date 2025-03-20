import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int findKthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) minHeap.add(num);
        while (--k > 0) minHeap.poll();
        return minHeap.poll();
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("Kth smallest element: " + findKthSmallest(arr, k));
    }
}
