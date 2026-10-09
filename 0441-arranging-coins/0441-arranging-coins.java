class Solution {
    public int Sqrt(long x) {
        if(x==0) return 0;
        long l=1,h=x;
        while(l<=h){
            long mid=l+(h-l)/2;
            if(mid==x/mid) return (int)mid;
            else if(mid>x/mid) h=mid-1;
            else l=mid+1;
        }
        return (int)h;
    }
    public int arrangeCoins(int n) {
        long m=(long)n; 
        int k=(Sqrt(8*m+1)-1)/2;
        return k;
    }
}