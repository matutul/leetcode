class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int reverse = 0;
        while(0<x){
            reverse = (reverse*10)+(x%10);
            x /= 10;
        }
        return (num == reverse);
    }
}