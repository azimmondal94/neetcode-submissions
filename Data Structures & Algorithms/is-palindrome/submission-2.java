class Solution {
    public boolean isPalindrome(String s) {
        int st = 0, e = s.length() - 1;
        
        while (st < e) {
            // Skip non-alphanumeric characters from the left
            while (st < e && !Character.isLetterOrDigit(s.charAt(st))) {
                st++;
            }
            // Skip non-alphanumeric characters from the right
            while (st < e && !Character.isLetterOrDigit(s.charAt(e))) {
                e--;
            }
            
            // Compare characters after converting them to lowercase
            char ch = Character.toLowerCase(s.charAt(st));
            char ch1 = Character.toLowerCase(s.charAt(e));
            
            if (ch != ch1) {
                return false;
            }
            
            st++;
            e--;
        }
        return true;
    }
}