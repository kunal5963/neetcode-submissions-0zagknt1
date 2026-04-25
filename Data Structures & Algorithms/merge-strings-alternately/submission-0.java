class Solution {
    public String mergeAlternately(String word1, String word2) {
        int j=0;
        int k=0;
        String biggerWord = word1.length()>=word2.length() ? word1 : word2;
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<biggerWord.length();i++) {
            if (j<word1.length()) {
                sb.append(word1.charAt(j));
                j++;
            }
            if (k<word2.length()) {
                sb.append(word2.charAt(k));
                k++;
            }
        }
        return sb.toString();
    }
}