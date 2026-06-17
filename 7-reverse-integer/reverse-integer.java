class Solution {
    public int reverse(int x) {

        boolean negative = x < 0;

        String s = Integer.toString(Math.abs(x));

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        try {
            int ans = Integer.parseInt(sb.toString());
            return negative ? -ans : ans;
        } catch (Exception e) {
            return 0;
        }
    }
}