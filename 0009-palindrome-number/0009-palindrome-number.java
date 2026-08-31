class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int n = x;
        int divisor = 1;

        // Find divisor for first digit
        for (int temp = n; temp >= 10; temp /= 10) {
            divisor *= 10;
        }

        while (n > 0) {

            int first = n / divisor;
            int last = n % 10;

            if (first != last) {
                return false;
            }

            // Remove first digit
            n = n % divisor;

            // Remove last digit
            n = n / 10;

            // Two digits removed
            divisor = divisor / 100;
        }

        return true;
    }
}