class Solution {
        public void rotate(int[][] matrix) {
        int n= matrix.length;
        for(int i =0; i<n; i++){
            for(int j =0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i =0; i<n; i++){
            reverse(matrix[i],0,n-1);
        }   
    }
    public void reverse(int[] arr,int start,int end){
        if(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            reverse(arr,start+1,end-1);
        }
        
    }
}
