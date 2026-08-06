class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        String s=String.valueOf(n);
        int a=1;
        for(int k=0;k<s.length();k++){
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