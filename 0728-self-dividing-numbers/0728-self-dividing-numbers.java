class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> n=new ArrayList<>();
        for(int i=left; i<=right;i++){
            Boolean f=true;
            int k=i;
            while(k>0){
                int r=k%10;
                if(r==0 || i%r!=0){
                    f=false;
                    break;
                }
                k/=10;
            }
            if(f){
                n.add(i);
            }
        }
        return n;
    }
}