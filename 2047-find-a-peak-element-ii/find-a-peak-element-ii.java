class Solution {
    public int[] findPeakGrid(int[][] matrix) {
       int startCol =0;
       int endCol = matrix[0].length-1;
       while(startCol<=endCol){
        int midCol = startCol + (endCol-startCol)/2;
        int maxRow = 0;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][midCol]>matrix[maxRow][midCol]){
                maxRow = i;
            }
        }
        int left = (midCol>0)? matrix[maxRow][midCol-1] : -1;
        int right = (midCol+1<matrix[0].length) ? matrix[maxRow][midCol+1] : -1;
        
        if(matrix[maxRow][midCol]>left && matrix[maxRow][midCol]>right){
            return new int []{ maxRow , midCol};
        }
        else if (matrix[maxRow][midCol]<left){
            endCol = midCol-1;

        }
        else {
            startCol = midCol +1;
        }
        
       }
       return new int [] {-1,-1};

     
    }
}