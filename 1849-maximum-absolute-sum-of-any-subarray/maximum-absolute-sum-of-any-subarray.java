class Solution {
    public int priMax(int nums[]){
          int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<nums.length; i++){
            cs+=nums[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        return ms;
    }
    public int primin(int nums[]){
        int ms = Integer.MAX_VALUE;
        int cs  =0;
        for(int i=0; i<nums.length; i++){
            cs+=nums[i];
            if(cs>0){
                cs=0;
            }
            ms = Math.min(cs,ms);
        }
        return ms;
    }

    public int maxAbsoluteSum(int[] nums) {
      int n = priMax(nums);
      int m = primin(nums);
      return Math.max(n,Math.abs(m));
    }
}