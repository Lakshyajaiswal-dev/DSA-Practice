class Solution {
    public String interpret(String c) {
        StringBuilder sb= new StringBuilder(c.length());
        for(int i=0; i<c.length(); i++){
            char ch = c.charAt(i);
            if(ch=='G'){
                sb.append('G');
            }
            else if (ch=='('){
                if(c.charAt(i+1)==')'){
                    sb.append('o');
                    i++;
                }
                else{
                    sb.append("al");
                    i+=3;
                }
            }
        } 
        return sb.toString();  
    }
}