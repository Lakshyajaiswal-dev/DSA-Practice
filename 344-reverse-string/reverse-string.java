class Solution {
    public void swap(char [] arr ,int i, int j){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<=end){
            swap(s,start,end);
            start++;
            end--;
        }
        
        
    }
}