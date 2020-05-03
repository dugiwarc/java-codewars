import java.util.LinkedList;

public class Scramblies {
        public static boolean scramble(String str1, String str2) {
                LinkedList<Character> linkedList = new LinkedList<Character>();
                for (char a : str1.toCharArray()) {
                        linkedList.add(a);
                }

                for (char a : str2.toCharArray()) {
                        if (!linkedList.remove((Character) a)) {
                                return false;
                        }

                }
                return false;
        }
}