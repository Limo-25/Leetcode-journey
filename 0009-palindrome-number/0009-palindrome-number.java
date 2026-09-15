class Solution {
    public boolean isPalindrome(int x) {
        int Reverse = 0;
        int original = x;

        if(x < 0) {
            return false;
        }
        
        while(x > 0){
            int LastDigit = x % 10;
            Reverse = (Reverse*10)+ LastDigit;
            x = x/10 ;
        }
        if(Reverse == original){
            return true;
        }
        else{
            return false;
        }
    }
}