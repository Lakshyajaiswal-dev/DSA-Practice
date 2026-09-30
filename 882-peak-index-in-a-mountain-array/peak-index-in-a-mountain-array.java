class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end  = arr.length-1;
        while(start<end){
            if(arr[start]>arr[end]){
                end--;
            }
            else{
                start++;
            }
        }
        return start;
    }
}