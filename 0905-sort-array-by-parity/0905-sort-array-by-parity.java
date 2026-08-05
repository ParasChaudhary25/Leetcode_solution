class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int piv=nums[l];
        while(l<h){
            while(l<nums.length-1 && nums[l]%2==0){
                l++;
            }
            while(h>-1 && nums[h]%2!=0){
                h--;
            }
            if(l<h){
                int temp=nums[l];
                nums[l]=nums[h];
                nums[h]=temp;
            }
            //int temp=nums[h];
            //nums[h]=piv;
            //piv=temp;
        }
        return nums;
    }
}