class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        int sCount = 0;
        int tCount = 0;
        for (int i = 0; i != s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))) {
                sCount = sMap.get(s.charAt(i));
                sMap.put(s.charAt(i), sCount+1);
            } else {
                sMap.put(s.charAt(i), 1);
            }
            if (tMap.containsKey(t.charAt(i))) {
                tCount = tMap.get(t.charAt(i));
                tMap.put(t.charAt(i), tCount+1);
            } else {
                tMap.put(t.charAt(i), 1);
            }
            sCount = 0;
            tCount = 0;
        }
        if (sMap.equals(tMap)) {
            return true;
        }

        return false;
    }
}
