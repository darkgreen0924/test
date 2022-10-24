package cn.lq.leetcode;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

public class Test1 {
    @Test
    public void test() {
        int[] nums = new int[]{29, 33, 6, 4, 42, 0, 10, 22, 62, 16, 46, 75, 100, 67, 70, 74, 87, 69, 73, 88};
        int left = 0;
        int curMax = nums[0];
        int leftMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curMax = Math.max(nums[i], curMax);
            if (nums[i] < leftMax) {
                leftMax = curMax;
                left = i;
            }
        }
        System.out.println(left + 1);
    }
}
