class Solution {
    public int search(int[] nums, int t) {
        if(nums.length==1){
            if(nums[0]!=t) return -1;
            else return 0;
        }
        
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==t) return mid;
            else if(nums[l]<=nums[mid]) {
                if(t>=nums[l] && t<=nums[mid]) h=mid-1;
                else l=mid+1;
            }
            else {
                if(t>=nums[mid] && t<=nums[h]) l=mid+1;
                else h=mid-1;
            }
        }
        return -1;
    }
}