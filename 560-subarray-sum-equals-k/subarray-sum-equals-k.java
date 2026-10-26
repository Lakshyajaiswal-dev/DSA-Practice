import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        for (int i = 1; i < nums.length; ++i) {
            nums[i] += nums[i - 1];
        }
         int count = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1); 
        for (int i = 0; i < nums.length; i++) {
            int s = nums[i] - k;
            if (m.containsKey(s)) {
                count += m.get(s);
            }
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }

        return count;
    }
}