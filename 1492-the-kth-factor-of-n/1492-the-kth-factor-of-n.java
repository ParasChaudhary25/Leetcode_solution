class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> fac=new ArrayList<>();
        for(int j=1;j<=n;j++){
            if(n%j==0) fac.add(j);
        }
        if(fac.size()<k) return -1;
        else{
            return fac.get(k-1);
        }
    }
}