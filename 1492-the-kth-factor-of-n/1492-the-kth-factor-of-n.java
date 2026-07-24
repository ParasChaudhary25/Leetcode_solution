class Solution {
    public int kthFactor(int n, int k) {
        int c=0;
        for(int j=1;j<=n;j++){
            if(n%j==0) {
                c++;
                if(c==k) return j;
            }
        }
        return -1;
    }
}