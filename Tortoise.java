public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        int[] res = new int[3];
        int tmp;
        res[0] = -1; 
        res[1] = -1; 
        res[2] = -1;
        if (v1 < v2)
        {
                tmp = 3600 * g / (v2 - v1);
                res[0] = tmp / 3600;
                res[1] = (tmp % 3600) / 60;
                res[2] = tmp % 60;
        } else return null;
        return res;
    }
}