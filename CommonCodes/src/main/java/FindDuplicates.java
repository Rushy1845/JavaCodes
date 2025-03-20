import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 5};
        HashSet<Integer> seen = new HashSet<>();
        System.out.print("Duplicate elements: ");
        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
