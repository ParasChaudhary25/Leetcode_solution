class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0;
        int e=numbers.length-1;
        int [] res=new int[2];
        while(s<e){
            if((numbers[s]+numbers[e])==target){
                res[0]=s+1;
                res[1]=e+1;
                break;
            }
            else if((numbers[s]+numbers[e])>target){
                e--;
            }
            else{
                s++;
            }
        }
        return res;
    }
}