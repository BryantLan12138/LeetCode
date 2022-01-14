public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!hashmap.containsKey(nums[i])) {
                hashmap.put(nums[i], 1);
            }
            else {
                int count = hashmap.get(nums[i]);
                count += 1;
                hashmap.put(nums[i], count);
            }
        }
        Integer key = Collections.max(hashmap.entrySet(), Map.Entry.comparingByValue()).getKey();

        int result = (Integer)key;
        return key;

    }
}
