import java.util.Arrays;

public class SupQueue {
        public static int queueTime(int[] customers, int n) {
                int[] result = new int[n];
                for (int i = 0; i < customers.length; i++) {
                        result[0] += customers[i];
                        System.out.println("Pre-sort : result[0] " + result[0]);
                        System.out.println("Pre-sort : result[1] " + result[1]);
                        Arrays.sort(result);
                        System.out.println("Post-sort : result[0] " + result[0]);
                        System.out.println("Post-sort : result[1] " + result[1]);
                }
                return result[n - 1];
        }

        public static void main(String[] args) {
                int[] a = { 10, 2, 3, 3 };
                queueTime(a, 2);
        }
}