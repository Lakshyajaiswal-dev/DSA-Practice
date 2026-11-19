class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int first =Math.abs(nums[n-1]-nums[2]);
        int last = Math.abs(nums[n-3]-nums[0]);
        int firstLast = Math.abs(nums[n-2]-nums[1]);
        int res = Math.min(first , Math.min(last , firstLast));
        return res;
    }
}