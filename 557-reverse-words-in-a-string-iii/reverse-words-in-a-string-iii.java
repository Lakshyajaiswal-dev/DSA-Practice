class Solution {
    
        public void swap(char[]arr , int a , int b){
           char temp = arr[a];
           arr[a]=arr[b];
           arr[b]=temp; 
        }
        public String reverseWords(String s) {
            String [] word = s.split(" ");
            for(int i=0; i<word.length; i++){
                char[] ch = word[i].toCharArray();
                int left =0;
                int right = ch.length-1;
                while(left<right){
                swap(ch, left, right);
                    left++;
                    right--;
                }
                word[i] = new String(ch);
            }
            return String.join(" ", word);
    }
}