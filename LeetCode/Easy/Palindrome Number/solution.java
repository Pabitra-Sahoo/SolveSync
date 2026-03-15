class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        long rev=0;
        if(x<0){
            return false;
        }
        while(temp!=0){
            int k=temp%10;
            rev=(rev*10)+k;
            temp=temp/10;
        }
        if(rev==x)return true;
        else return false;
    }
}