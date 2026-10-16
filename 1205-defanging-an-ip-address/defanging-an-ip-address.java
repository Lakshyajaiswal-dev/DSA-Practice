class Solution {
    public String defangIPaddr(String ad) {
        StringBuilder sb = new StringBuilder(ad.length());
        for(int i=0; i<ad.length(); i++){
            char ch = ad.charAt(i);
            if(ch=='.'){
                sb.append("[.]");
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}