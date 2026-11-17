class Solution {
    public int nextGreaterElement(int n) {
        char []arr = String.valueOf(n).toCharArray();
        int dip = -1;
        int  len = arr.length; 
        for(int i=len-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                dip=i;
                break;
            }
        }
        if(dip==-1) return -1;
        for(int i=len-1; i>dip; i--){
            if(arr[i]>arr[dip]){
               char temp = arr[i];
               arr[i]=arr[dip];
               arr[dip]= temp;
               break;
            }
        }
        int left = dip+1;
        int right = len-1;
        while(left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        long ans = Long.parseLong(new String (arr));
        if(ans>Integer.MAX_VALUE) return -1;
        return (int)ans;
    }
}