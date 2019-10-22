import java.util.HashMap;
import java.util.Map;

public class PairsOfSongsWith60 {

    public static void main(String[] arg) {
        System.out.println(numPairsDivisibleBy60(new int[]{30,20,150,100,40,30,20,150,100,40,30,20,150,100,40,30,20,150,100,40,30,20,150,100,40,30,20,150,100,40}));
    }

    public static int numPairsDivisibleBy60(int[] time) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for (int t : time) {

            int x = 60 - t % 60;
            if (map.containsKey(x)) {

                count += map.get(x);
            }
            map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);
        }
        return count;
    }

    public static int numPairsDivisibleBy601(int[] time) {
        Map<Integer, Integer> map = new HashMap();
        int count = 0;
        for (int i = 0; i< time.length; i++) {
            for (int j = 1; j < 17; j++ ) {
                int tmp = j * 60 - time[i];
                if (map.containsKey(tmp)) {
                    count += map.get(tmp);
                }
            }
            if (map.containsKey(time[i])) {
                map.replace(time[i], map.get(time[i]) + 1);
            } else {
                map.put(time[i],1);
            }

        }
        return count;
    }

}
