class Solution {
    public static void ad(List<Integer> s,List<List<Integer>> nn ){
        nn.add(new ArrayList<>(s));
    }
    public static void sub(List<Integer> s, int[] nums,int n,List<List<Integer>> nn){
        if(n<0){
            ad(s,nn);
            return ;
        }
        // add
        s.add(nums[n]);
        sub(s,nums,n-1,nn);

        // not add 
        s.remove(s.size()-1);
        sub(s,nums,n-1,nn);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> s=new ArrayList<>();
        List<List<Integer>> nn=new ArrayList<>();
        sub(s,nums,nums.length-1,nn);
        return nn;
    }
}