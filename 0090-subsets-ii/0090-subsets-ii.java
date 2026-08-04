class Solution {
    public static void ad(List<Integer> s,HashSet<List<Integer>> nn ){
        nn.add(new ArrayList<>(s));
    }
    public static void sub(List<Integer> s, int[] nums,int n,HashSet<List<Integer>> nn){
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
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> s=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        HashSet<List<Integer>> nn=new HashSet<>();
        sub(s,nums,nums.length-1,nn);
        for(List<Integer> a:nn){
            res.add(a);
        }
        return res;
    }
}