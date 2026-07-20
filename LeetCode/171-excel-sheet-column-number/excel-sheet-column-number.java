class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for(int i=0 ; i<columnTitle.length() ; i++){
            sum = sum*26 + ((int)columnTitle.charAt(i)-64);
        }
        return sum;
    }
}