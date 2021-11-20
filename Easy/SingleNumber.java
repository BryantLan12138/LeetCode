public class SingleNumber {
    public int singleNumber(int[] nums) {
        // using XOR operation
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
