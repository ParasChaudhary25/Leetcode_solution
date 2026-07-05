class Solution {
    public int gcdOfOddEvenSums(int n) {
        int od=n*n;
        int ev=n*(n+1);
        int r=od;
        while(r!=0){
            r=ev%od;
            ev=od;
            od=r;
        }
        return ev;
        
    }
}