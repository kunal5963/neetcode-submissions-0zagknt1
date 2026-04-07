class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, Integer> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (int i=0;i<strs.length;i++) {
            List<String> resultMid = new ArrayList<>();
            if (i==strs.length-1 && map.containsKey(strs[strs.length-1])) {
                continue;
            } else if (i==strs.length-1 && !map.containsKey(strs[strs.length-1])) {
                resultMid.add(strs[strs.length-1]);
                map.put(strs[strs.length-1],i);
                result.add(resultMid);
                continue;
            }
            if (!map.containsKey(strs[i])) {
                resultMid.add(strs[i]);
                map.put(strs[i],i);
            } else {
                continue;
            }
            for (int j=i+1;j<strs.length;j++) {
                if (isAnagram(strs[i], strs[j])) {
                    resultMid.add(strs[j]);
                    map.put(strs[j],j);
                } else {
                    continue;
                }
            }
            result.add(resultMid);
        }
        return result;
    }

    private boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()) {
            return false;
        }
        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);
        String newA = new String(charA);
        String newB = new String(charB);
        return newA.equals(newB) ? true : false;
    }
}
