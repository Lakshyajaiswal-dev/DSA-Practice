class Solution {
    public boolean judgeCircle(String m) {
       int cL = 0;
       int cU = 0;
       for(int i=0; i<m.length(); i++){
        if(m.charAt(i)=='L'){
            cL++;
        }
        else if(m.charAt(i)=='R'){
            cL--;
        }
        else if(m.charAt(i)=='U'){
            cU++;
        }
        else{
            cU--;
        }
       }
      return (cL==0)&&(cU==0);
    }
}