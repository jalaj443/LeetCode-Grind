class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first= findfirst(nums,target);
        int last= findlast(nums,target);
        return new int[]{first,last};
    }
    int findfirst(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    int findlast(int[]nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                start=mid+1;
            }
        }
       
       return ans; }
}