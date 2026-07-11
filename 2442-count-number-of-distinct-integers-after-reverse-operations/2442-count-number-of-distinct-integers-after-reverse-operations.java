class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int n:nums){
            s.add(n);
            int rev=0;
            int temp=n;
            while(temp>0){
                rev=rev*10+temp%10;
                temp/=10;
            }
            s.add(rev);
        }
        return s.size();
    }
}