class Solution {
    public boolean checkPerfectNumber(int num) {
        int count =1;
        if (num <= 1) {
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                count += i;
                    if(i*i != num){
                    count += num/i;
                }
            }
            
        }
         if(count==num){
            return true;
        }
       
        return false;
    }
}