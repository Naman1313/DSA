class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            long lcm = 1;

            for (int j = i; j < n; j++) {
                lcm = lcm(lcm, nums[j]);

                if (lcm == k) {
                    count++;
                }

                // LCM can only increase, so stop if it exceeds k
                if (lcm > k || k % lcm != 0) {
                    break;
                }
            }
        }

        return count;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}