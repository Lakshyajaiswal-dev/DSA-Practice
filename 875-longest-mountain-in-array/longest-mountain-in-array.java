class Solution {
    public int longestMountain(int[] arr) {
     int n = arr.length;
     int maxlean = 0;
     if(n<3){
        return 0;
     }
     for(int i=1; i<=n-2; i++){
        if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
            int left = i;
            int right =i;
            while(left>0 && arr[left]>arr[left-1]){
                left--;
            }
            while(right<n-1 && arr[right]>arr[right+1]){
                right++;
            }
            int count  = right-left+1;
            maxlean = Math.max(maxlean , count);
        }

     }
             return maxlean ;
       
    }
}