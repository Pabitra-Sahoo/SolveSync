class Solution {
    public int myAtoi(String s) {
        // Step 1: Skip leading whitespace
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        
        // Step 2: Check for sign (+ or -)
        int sign = 1;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        // Step 3: Read digits and build the number
        long result = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            
            // Step 4: Handle overflow/underflow
            if (result > Integer.MAX_VALUE) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            i++;
        }
        
        return (int)(result * sign);
    }
}