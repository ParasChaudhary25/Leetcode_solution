class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] num={-1,-1};
        int lo=0,hi=nums.length-1;
        int idx=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]>target) hi=mid-1;
            else if(nums[mid]<target) lo=mid+1;
            else{
                idx=mid;
                hi=mid-1;
            }
        }
        if(idx!=-1){
            num[0]=idx;
        }
        lo=0;
        hi=nums.length-1;
        idx=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]>target) hi=mid-1;
            else if(nums[mid]<target) lo=mid+1;
            else{
                idx=mid;
                lo=mid+1;
            }
        }
        if(idx!=-1){
            num[1]=idx;
        }
        return num;  
    }
}