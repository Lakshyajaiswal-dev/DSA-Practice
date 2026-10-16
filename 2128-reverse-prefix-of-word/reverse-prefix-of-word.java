class Solution {
    public String reversePrefix(String w, char ch) {
        StringBuilder sb = new StringBuilder(w.length());
        int count=0;
        for(int i=0; i<w.length();i++){
            char cha = w.charAt(i);
            if(cha==ch){
                sb.append(cha);
                if(count==0){
                    sb.reverse();
                }
                count++;
                


            }
            else{
                 sb.append(cha);
            }
        }
        return sb.toString();
    }
}