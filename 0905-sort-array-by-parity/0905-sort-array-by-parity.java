class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        int h=nums.length-1;
        while(l<h){
            if(l<nums.length-1 && nums[l]%2==0){
                l++;
            }
            if(h>-1 && nums[h]%2!=0){
                h--;
            }
            if(l<h){
                int temp=nums[l];
                nums[l]=nums[h];
                nums[h]=temp;
            }
        }
        return nums;
    }
}