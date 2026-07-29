class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Integer[] num=new Integer[nums.length];
        for(int j=0;j<nums.length;j++){
            num[j]=nums[j];
        }
        List<Integer> n=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int c=1;
            if(num[i]==null){
                    continue;
                }
            for(int j=i+1;j<nums.length;j++){
                if(num[j] != null && num[i].equals(num[j])){
                    c++;
                    num[j]=null;
                }
            }
            if(c>(num.length)/3) n.add(num[i]);
        }
        return n;
    }
}