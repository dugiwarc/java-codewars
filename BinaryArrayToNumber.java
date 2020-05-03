import java.util.List;
import java.util.*;

// public class BinaryArrayToNumber {
//         public static int ConvertBinaryArrayToInt(List<Integer> binary) {
//                 return binary.stream().reduce((x, y) -> x * 2 + y).get();
//         }
// }

public class BinaryArrayToNumber {
        public static int ConvertBinaryArrayToInt(List<Integer> binary) {
                int number = 0;
                for (int bit : binary)
                        number = number << 1 | bit;
                return number;
        }

        public static void main(String[] args) {
                List<Integer> list = Arrays.asList(0, 1, 1, 0);

                // list = { 1, 0, 1, 0 };
                int a = BinaryArrayToNumber.ConvertBinaryArrayToInt(list);
                System.out.println(a);
        }
}