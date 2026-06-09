 class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> count_s1 = new HashMap<>();
        for (char c : s1.toCharArray())
            count_s1.put(c, count_s1.getOrDefault(c, 0) + 1);

        Map<Character, Integer> window_count = new HashMap<>();
        int k = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            window_count.put(c, window_count.getOrDefault(c, 0) + 1);

            if (i >= k) {
                char leftChar = s2.charAt(i - k);
                window_count.put(leftChar, window_count.get(leftChar) - 1);
                if (window_count.get(leftChar) == 0)
                    window_count.remove(leftChar);
            }

            if (window_count.equals(count_s1))
                return true;
        }

        return false;
    }
}

