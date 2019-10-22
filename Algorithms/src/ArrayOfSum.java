public class ArrayOfSum {
    public static void main(String[] s) {
        addNum(null);
        addNum(new int[]{1});
    }

    public static int[] addNum(int[] a) {
        if (a == null || a.length == 0)
            return a;

        int[] temp = new int[a.length];
        temp[0] = a[0];
        int count = 0;
        int num = 2;
        int j = 1;
        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            if (count < num && i < a.length) {
                sum += a[i];
                count++;
            } else {
                temp[j] = sum;
                j++;
                num++;
                sum = 0;
                count = 0;
                if (i < a.length - 1) {
                    i--;
                }
            }
            if (i == a.length - 1) {
                temp[j] = sum;
                j++;
                num++;
                sum = 0;
                count = 0;
            }
        }

        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
