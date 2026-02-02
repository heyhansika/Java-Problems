import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {

        int[] scores = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Arrays.sort(scores);

        int kthLargest = scores[scores.length - k];

        System.out.println(kthLargest);
    }
}

