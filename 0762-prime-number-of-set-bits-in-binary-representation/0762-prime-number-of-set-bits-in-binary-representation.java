class Solution {
    public int countPrimeSetBits(int left, int right) {
        int p=0;
        for(int i=left;i<=right;i++){
            String s=Integer.toString(i,2);
            int c=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    c++;
                }
            }
            if(c==2 || c==3 || c==5 || c==7 ||c==11 ||c==13 || c==17|| c==19|| c==23||c==29 || c==31){
                p++;
            }
        }
        return p;
    }
}