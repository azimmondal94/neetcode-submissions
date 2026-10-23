class Solution {
    public int lengthOfLongestSubstring(String s) {
       boolean[] f=new boolean[256];
       int n=s.length();
       int ans=0;
       int i=0,j=0;
       while(j<n){
            char ch=s.charAt(j);
            while(f[ch]){
                f[s.charAt(i)]=false;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            f[ch]=true;
            j++;
       } 
       return ans;
    }
}
