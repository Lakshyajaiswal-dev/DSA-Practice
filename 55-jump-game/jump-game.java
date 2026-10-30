class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        int last = nums.length - 1;

        for (int i = 0; i <= last; i++) {
            // Agar hum current index tak pahunch hi nahi sakte
            if (i > maxReach) {
                return false;
            }

            // Dekho yahan se kitni door tak maximum ja sakte hain
            maxReach = Math.max(maxReach, i + nums[i]);

            // Agar last index ya uske paar pahunch gaye
            if (maxReach >= last) {
                return true;
            }
        }

        return false;
    }
}