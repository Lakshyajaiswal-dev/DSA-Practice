class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int arr1 [] = new int [1001];
        int arr2 []= new int [1001];
        for(int i=0; i<target.length; i++){
            arr1[target[i]]++;
        }
        for(int i=0; i<arr.length;i++){
            arr2[arr[i]]++;
        }
        for(int i=0; i<1001;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    
}