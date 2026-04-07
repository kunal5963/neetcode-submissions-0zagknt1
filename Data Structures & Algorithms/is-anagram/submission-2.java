class Solution {
    public boolean isAnagram(String s, String t) {
        int output = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i=0;i<t.length();i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
        }

        boolean allZero = map.values().stream().allMatch(v -> v == 0);
        return allZero;
    }
}
