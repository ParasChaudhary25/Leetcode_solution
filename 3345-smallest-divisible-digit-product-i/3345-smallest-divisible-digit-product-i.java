class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        String s=String.valueOf(n);
        int j=s.length();
        int a=1;
        for(int k=0;k<j;k++){
            a*=Character.getNumericValue(s.charAt(k));
        }
        if(a%t==0){
            return Integer.parseInt(s);
        }
        else{
            n++;
        }}
      
    }
}