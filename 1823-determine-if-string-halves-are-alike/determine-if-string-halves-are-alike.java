class Solution {
    public boolean halvesAreAlike(String s) {
       char arr[]=s.toCharArray();
       int left =0;
       int right = s.length()-1;
       int lc=0 ; 
       while(left<right){
            char l=Character.toLowerCase(arr[left]);
            char r=Character.toLowerCase(arr[right]);
            if(l=='a' || l=='e' ||l=='i' || l=='o' || l=='u' ){
                lc++;
            }
            left++;
             if(r=='a' || r=='e'||r=='i' || r=='o' || r=='u' ){
                lc--;
            }
            
            right--;
        }
       return lc==0;
    }
}