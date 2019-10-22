package com.tobibur.swipequotes.model;

import java.util.HashMap;

public class test {
    public static void main(String[] s) {
        System.out.println(subarraySum(new int[]{0, 0, 5, 5, 0, 0}));
    }

    public static int subarraySum(int[] nums) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum))
                count += map.get(sum);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
