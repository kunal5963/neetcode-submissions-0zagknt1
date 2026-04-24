class Solution {
    public boolean isPalindrome(String s) {
        String newString = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i=newString.length()-1;i>=0;i--) {
            sb.append(newString.charAt(i));
        }
        String reversedString = sb.toString().toLowerCase();
        return newString.equals(reversedString) ? true : false;
    }
}
