class Solution {
    public boolean checkIfExist(int arr []) {
        Arrays.sort(arr);
        for (int i =0; i<arr.length; i++){
            int a = 2* arr[i];
           
        
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==a && mid !=i){
                return true;
            }
            else if(arr[mid]>a){
                end= mid-1;
            }
            else {
                start = mid+1;
            }
        }
        }
        return false;
    }
    
   
}