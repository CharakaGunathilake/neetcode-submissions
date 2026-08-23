class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i != s.length(); i++) {
            sMap.put(s.charAt(i), sMap.containsKey(s.charAt(i)) ? sMap.get(s.charAt(i)) + 1 : 1);
            tMap.put(t.charAt(i), tMap.containsKey(t.charAt(i)) ?tMap.get(t.charAt(i)) + 1 : 1);
        }
        if (sMap.equals(tMap)) {
            return true;
        }

        return false;
    }
}
