class Solution {
    public int strStr(String ha, String ne) {
       boolean res = ha.contains(ne);
       int min = Integer.MAX_VALUE;
       if(res==true){
          for(int i=0; i<=ha.length()-ne.length(); i++){
            int j =0;
            for(j=0; j<ne.length(); j++){
             if (ha.charAt(i + j) != ne.charAt(j)){
                break;
             }
           
          }
           if(j==ne.length()){
             return i;
            }
          }
       }
      

       return -1;
    }
}