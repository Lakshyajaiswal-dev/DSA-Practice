class Solution {
    public int maximumCount(int[] nums) {
        int n = PosNo( nums );
         int m = NegNo( nums );
         if(n>m){
            return n;
         }
         else {
            return m;
         }

        
    }
    public int PosNo(int [] nums){
        int start = 0;
        int end = nums.length-1;
         int count = 0;
        while(start<=end){
           
            int mid = start + (end - start)/2;
            if (nums[mid]>0){
                count = nums.length-mid;
                end= mid-1;

            }
            else{
                start = mid+1;
            }
        }
        return count;
    }
    public int NegNo(int [] nums){
        int start = 0;
        int end = nums.length-1;
        int count1 = 0;
        while(start<=end){
            
            int mid = start + (end - start)/2;
            if (nums[mid]<0){
                count1 = mid +1;
                start= mid+1;

            }
            else{
                 end= mid-1;
            }
        }
        return count1;
    }
}