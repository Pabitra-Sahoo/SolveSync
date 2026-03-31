class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int L = n + m - 1;
        
        char[] res = new char[L];
        boolean[] fixed = new boolean[L];
        
        // Step 1: Handle all 'T' constraints
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    int idx = i + j;
                    if (fixed[idx] && res[idx] != str2.charAt(j)) {
                        return ""; // Contradiction between overlapping 'T's
                    }
                    res[idx] = str2.charAt(j);
                    fixed[idx] = true;
                }
            }
        }
        
        // Step 2: Fill non-fixed positions with 'a' (Lexicographically smallest)
        for (int i = 0; i < L; i++) {
            if (!fixed[i]) {
                res[i] = 'a';
            }
        }
        
        // Step 3: Handle 'F' constraints from right to left to maintain lexicographical order
        // Actually, checking left to right is fine, but we must modify the rightmost 
        // possible char in the window to minimize the impact on the prefix.
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'F') {
                if (checkMatch(res, str2, i)) {
                    if (!modifyRightmost(res, fixed, str2, i)) {
                        return ""; // No character could be changed to break the 'F'
                    }
                }
            }
        }
        
        // Step 4: Final verification 
        // Changing a char for an 'F' might have accidentally satisfied a previous 'F'.
        // We re-check all constraints to ensure validity.
        for (int i = 0; i < n; i++) {
            boolean match = checkMatch(res, str2, i);
            if (str1.charAt(i) == 'T' && !match) return "";
            if (str1.charAt(i) == 'F' && match) return "";
        }
        
        return new String(res);
    }
    
    private boolean checkMatch(char[] res, String str2, int start) {
        for (int j = 0; j < str2.length(); j++) {
            if (res[start + j] != str2.charAt(j)) return false;
        }
        return true;
    }
    
    private boolean modifyRightmost(char[] res, boolean[] fixed, String str2, int start) {
        int m = str2.length();
        // Try to change the rightmost index that isn't locked by a 'T'
        for (int j = m - 1; j >= 0; j--) {
            int idx = start + j;
            if (!fixed[idx]) {
                // Change to the smallest char that isn't str2[j]
                for (char c = 'a'; c <= 'z'; c++) {
                    if (c != str2.charAt(j)) {
                        res[idx] = c;
                        return true;
                    }
                }
            }
        }
        return false; // All characters in this 'F' window were locked by 'T's
    }
}