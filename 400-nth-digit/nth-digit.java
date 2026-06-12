class Solution {
    public int findNthDigit(int n) {
        long digitLength = 1;
        long count = 9;
        long start = 1;

        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }

        long number = start + (n - 1) / digitLength;

        int digitIndex = (int) ((n - 1) % digitLength);

        String str = String.valueOf(number);

        return str.charAt(digitIndex) - '0';
    }
}