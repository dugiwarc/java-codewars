import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JosephusSurvivor {
        public static int josephusSurvivor(final int n, final int k) {
                List<Integer> people = new LinkedList<>();
                for (int i = 0; i <= n; i++) {
                        people.add(i);
                }

                Iterator iter = people.iterator();
                while (people.size() > 1) {
                        for (int i = 0; i < k; i++) {
                                if (!iter.hasNext()) {
                                        iter = people.iterator();
                                }
                                iter.next();
                        }
                        iter.remove();
                }
                return people.get(0);
        }
}