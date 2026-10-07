class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lo=0,hi=arr.length-1;
        while(lo<=hi){
            int mid=0;
            if((lo+hi)%2!=0){
                mid=((lo+hi)/2)+1;
            }
            else{
            mid=(lo+hi)/2;}
            if(mid>0 && (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])){
                return mid;
            }
            else if(mid>0 &&(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return -1;
    }
}