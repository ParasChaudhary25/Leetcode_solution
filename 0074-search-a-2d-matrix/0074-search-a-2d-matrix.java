class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int l=0, h=r*c-1;
        while(l<=h){
            int mid=(l+h)/2;
            int midr=mid/c;
            int midc=mid%c ;
            if(matrix[midr][midc]==target) return true;
            else if(matrix[midr][midc]>target) h=mid-1;
            else l=mid+1;
        }
        return false;
    }
}