class Solution {
    public boolean validPalindrome(String s) {
        if (isPalindrome(s)) {
            return true;
        }
        for (int i=0;i<s.length()-1;i++) {
            String sub = s.substring(0,i)+s.substring(i+1,s.length());
            if (isPalindrome(sub)) {
                return isPalindrome(sub);
            } else {
                continue;
            }
            
        }
        return false;
    }

    private boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=s.length()-1;i>=0;i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString().equals(s) ? true : false;
    }
}