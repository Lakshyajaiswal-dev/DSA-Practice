class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        int a1 = c1.charAt(0);
        int b1 = c1.charAt(1);
        int a2 = c2.charAt(0);
        int b2 = c2.charAt(1);
        int d1= a1+b1;
        int d2 = a2+b2;
        if((d1%2==0)&&(d2%2==0)){
            return true;
        }
        else if((d1%2!=0)&&(d2%2!=0)){
             return true;
        }
        return false;
    }
}