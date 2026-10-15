class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        if(n!=t.length()) return false;
        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int x:arr){
            if(x!=0) return false;
        }
        return true;
    }
}
