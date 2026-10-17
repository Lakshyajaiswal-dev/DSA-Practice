class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder();

        for(int i=0; i<w1.length; i++){
            s.append(w1[i]);
        }
        
        for(int i=0; i<w2.length; i++){
            s1.append(w2[i]);
        }
        if(s.toString().equals(s1.toString())){
            return true;
        }
        return false;


    }
}