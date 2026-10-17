class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] front=new int[n];
        int[] back=new int[n];
        front[0]=1; front[1]=nums[0];
        back[n-1]=1;back[n-2]=nums[n-1];
        for(int i=2;i<n;i++){
            front[i]=front[i-1]*nums[i-1];
            back[n-1-i]=back[n-i]*nums[n-i];
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=front[i]*back[i];
        }
        return ans;
    }
}  
