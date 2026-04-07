class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        String str1 = new String(sArray);
        String str2 = new String(tArray);
        return str1.equals(str2) ? true : false;
    }
}
