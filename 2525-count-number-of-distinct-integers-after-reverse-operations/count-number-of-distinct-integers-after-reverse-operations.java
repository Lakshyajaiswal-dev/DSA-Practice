class Solution {
    public int rev (int n){
        int sum = 0;
        while(n!=0){
           int y = n%10;
           sum = (sum*10)+y;
           n = n/10;
        }
        return sum;
    }
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        int arr [] = new int [2*n];
        for(int i=0; i<n ; i++){
            arr[i]=nums[i];
            arr[i+n] = rev(nums[i]);

        }
        int count =1;
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            if (arr[i] != arr[i-1]){
                count++;
            }
        }
        return count;

        
    }
}