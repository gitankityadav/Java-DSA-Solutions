class Solution {
    public boolean search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
       Arrays.sort(nums);
       while (s<=e){
            int m=s+(e-s)/2;
            if (nums[m]==target)return true;
            else if (nums[m]<target){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return false;
    }
}