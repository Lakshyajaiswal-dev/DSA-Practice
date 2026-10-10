class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int arr [] = new int [n];
        int j=0;
        
        int max = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
                  arr[j]=0;
             while(nums[i]>0){
             arr[j] +=nums[i]%10;
             nums[i]=nums[i]/10;
           }
          
           max = Math.min(arr[j], max);
            j++;
        }
        return max;
        
    }
}