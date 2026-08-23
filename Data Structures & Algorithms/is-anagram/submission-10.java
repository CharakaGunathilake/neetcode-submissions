class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i != s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))) {
                int count = sMap.get(s.charAt(i));
                sMap.put(s.charAt(i), count+1);
            } else {
                sMap.put(s.charAt(i), 1);
            }
            if (tMap.containsKey(t.charAt(i))) {
                int count = tMap.get(t.charAt(i));
                tMap.put(t.charAt(i), count+1);
            } else {
                tMap.put(t.charAt(i), 1);
            }
        }
        if (sMap.equals(tMap)) {
            return true;
        }

        return false;
    }
}
