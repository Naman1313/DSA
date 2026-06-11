class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            sum = sum*26 + ((int)columnTitle.charAt(i)-64);
        }
        return sum;
    }
}