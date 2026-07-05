class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] num=new int[2];
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                num[0]=i;
                c=1;
                break;
            }
        }
        if(c==0){
            num[0]=-1;
            num[1]=-1;
        }
        else{
        for(int i=n-1;i>=0;i--){
            if(nums[i]==target){
                num[1]=i;
                break;
            }
        }}
        return num;  
    }
}