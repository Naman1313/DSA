class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x%10==0 && x!=0){
            return false;
        }
        int revnum =0;
        int num = x;
        while(num>0){
            revnum = revnum*10 + num%10;
            num=num/10;
        }
        if(x == revnum){
            return true;
        }
        else{
            return false;
        }
    }
}