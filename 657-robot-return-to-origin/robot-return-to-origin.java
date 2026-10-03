class Solution {
    public boolean judgeCircle(String m) {
       int cL = 0;
       int cR = 0;
       int cU = 0;
       int cD = 0;
       for(int i=0; i<m.length(); i++){
        if(m.charAt(i)=='L'){
            cL++;
        }
        else if(m.charAt(i)=='R'){
            cR++;
        }
        else if(m.charAt(i)=='U'){
            cU++;
        }
        else{
            cD++;
        }
       }
       if((cL==cR)&&(cU==cD)){
        return true;
       }
       return false;
    }
}