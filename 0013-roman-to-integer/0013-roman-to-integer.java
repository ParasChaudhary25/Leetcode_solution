class Solution {
    public int romanToInt(String s) {
        int n=0;
        for (int i=0;i<s.length();i++){
            if(i!=s.length()-1){
            if(s.charAt(i)=='I' ){
                if(s.charAt(i+1)=='V'){
                    n=n+4;
                    i++;
                }
                else if(s.charAt(i+1)=='X'){
                    n=n+9;
                    i++;
                }
                else{
                n++;}
            }
            else if(s.charAt(i)=='V'){
                n=n+5;
            }
            else if(s.charAt(i)=='X'){
                if(s.charAt(i+1)=='L'){
                    n=n+40;
                    i++;
                }
                else if(s.charAt(i+1)=='C'){
                    n=n+90;
                    i++;
                }
                else{
                n=n+10;}
            }
            else if(s.charAt(i)=='L'){
                n=n+50;
            }
            else if(s.charAt(i)=='C'){
                if(s.charAt(i+1)=='D'){
                    n=n+400;
                    i++;
                }
                else if(s.charAt(i+1)=='M'){
                    n=n+900;
                    i++;
                }
                else{
                n=n+100;}
            }
            else if(s.charAt(i)=='D'){
                n=n+500;
            }
            else if(s.charAt(i)=='M'){
                n=n+1000;
            }}
            else{
                if(s.charAt(i)=='I' ){
            
                
                n++;
            }
            else if(s.charAt(i)=='V'){
                n=n+5;
            }
            else if(s.charAt(i)=='X'){
                n=n+10;
            }
            else if(s.charAt(i)=='L'){
                n=n+50;
            }
            else if(s.charAt(i)=='C'){
                n=n+100;
            }
            else if(s.charAt(i)=='D'){
                n=n+500;
            }
            else if(s.charAt(i)=='M'){
                n=n+1000;
            }
            }
        }
        return n;
    }
}