package javaprogram;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result1 {

    /*
     * Complete the 'countPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY numbers
     *  2. INTEGER k
     */

    public static int countPairs() {
        // Write your code here
//        List<Integer> numbers = List.of(1, 2, 5, 3, 4);
        List<Integer> numbers = List.of(1, 1, 2, 2, 3,3);
        int k = 1;
        Map pairs = new HashMap<Integer, Integer>();
        int result = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (pairs.containsKey(numbers.get(i))) {
                continue;
            } else if (pairs.containsKey(numbers.get(i) - k) || pairs.containsKey(numbers.get(i) + k) || k==0) {
                result++;
            }
            pairs.put(numbers.get(i), 0);
        }
        return result;
    }
}

public class JavaTest1 {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader;
//        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.countPairs();
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}