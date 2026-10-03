class Solution {
    public String reverse(String s){
          char[] arr = s.toCharArray();
          int left=0;
          int right=arr.length-1;
          while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=(char)temp;
            left++;
            right--;
     }
     return new String(arr);
    }
    public String reversePrefix(String s, int k) {
        int left =0;
        int right = k-1;
        String arr1 = new String();
        String part = s.substring(0, k);
        arr1 = reverse(part) + s.substring(k);
        return arr1;
    }
}