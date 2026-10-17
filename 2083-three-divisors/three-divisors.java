class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                count++;
            }
        }
        count+=2;
        return count==3;
    }
}