class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()) {
            if((ch>='a'&&ch<='z') || (ch>='0' && ch<='9')) sb.append(ch);
            else if(ch>='A' && ch<='Z') sb.append(Character.toLowerCase(ch));
        }
        s=sb.toString();
        int n=s.length();
        for(int i=0;i<n/2;i++) if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        return true;
    }
}
