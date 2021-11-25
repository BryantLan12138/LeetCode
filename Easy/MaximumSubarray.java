public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for(int i = 0; i < nums.length; i++) {
            tmp += nums[i];

            // compare the tmp and highest recorded value
            max = Math.max(max, tmp);
            if(tmp < 0) {
                tmp = 0;
            }
        }
        return max;
    }
}
