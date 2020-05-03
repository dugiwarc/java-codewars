public class XO {
        public static boolean getXO(String str) {
                int x = 0, o = 0;
                for (int i = 0; i < str.length(); i++) {
                        if (str.toUpperCase().charAt(i) == 'O')
                                o++;
                        if (str.toUpperCase().charAt(i) == 'X')
                                x++;
                }
                return x == o;
        }

        // public static void main(String args[]) {
        // }
}
