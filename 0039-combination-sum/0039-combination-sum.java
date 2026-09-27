class Solution {
    List<List<Integer>> list = new ArrayList<>();
    void helper(int index,int target,int []nums,ArrayList<Integer> temp)
    {   
        if(target<0||index>=nums.length)
        return;
        if(target==0)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        helper(index,target-nums[index],nums,temp);
        temp.remove(temp.size()-1);
        helper(index+1,target,nums,temp);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(0,target,candidates,new ArrayList<>());
        return list;
    }
}