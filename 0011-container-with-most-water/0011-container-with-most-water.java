class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int n=height.length-1;
        int r=n;
        int a=0;
        int c=0;
        while(r>l){
            if(height[l]<height[r]){
                c=height[l]*n;
            }
            else if(height[l]>height[r]){
                c=height[r]*n;
            }
            else{
                c=height[l]*n;
            }
            if(c>a){
                a=c;
            }
            if(height[l]<height[r]){
                l++;
                n--;
            }
            else if(height[l]>height[r]){
                r--;
                n--;
            }
            else{
                r--;
                n--;
            }

        }
        return a;
    }
}