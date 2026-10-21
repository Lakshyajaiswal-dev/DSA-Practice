class Solution {
    public int numberOfSpecialChars(String word) {
        int [] st = new int [26];
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
             if(ch>='a' && ch<='z'){
                 int ind = ch-'a';
                 if(st[ind]==0){
                    st[ind]=1;
                 }
                 else if(st[ind]==2){
                    st[ind]=-1;
                }
             }
             else if(ch>='A' && ch<='Z'){
                int ind = ch-'A';
                if(st[ind]==1){
                    st[ind]=2;
                }
                else if(st[ind]==0){
                    st[ind]=-1;
                }
                
             }
        }
        int count=0;
        for(int i=0; i<st.length; i++){
            if(st[i]==2){
                count++;
            }
        }
        return count;
    }
}